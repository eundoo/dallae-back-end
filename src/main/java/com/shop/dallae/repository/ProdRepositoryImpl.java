package com.shop.dallae.repository;

import com.shop.dallae.dto.ProdDTO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import java.util.Collections;
import java.util.List;

//ItemListRepositoryImpl는 쿼리에 관한 작업처리
public class ProdRepositoryImpl implements ProdRepositoryCustom {
    @PersistenceContext
    private EntityManager em;

    //검색된 키워드로 제품반환
    @Override
    public List<ProdDTO> findProdsBySearch(String searchedWords) {

        System.out.println("findProdsBySearch");
        if (searchedWords == null || searchedWords.isEmpty()) return Collections.emptyList();

        String[] wordBreak = searchedWords.trim().split(" ");

// JPQL 문자열 생성
// 이거 jpa로 바꿀 수 있을 듯
// phr는 p.phrCd의 별칭이고,
// p는 ProdEntity이고,
// ProdEntity의 phrCd 필드는 @ManyToOne으로 맵핑된 PhrEntity 타입이기 때문에
// JPA는 자동으로 phr가 PhrEntity 타입임을 알 수 있습니다.
        StringBuilder jpql = new StringBuilder("""
        SELECT new com.shop.dallae.dto.ProdDTO(
            p.id, p.prodCd, p.colorCd, p.sizeCd, p.price,
            phr.phrCd, phr.phrTitle, phr.phrDesc1, phr.phrDesc2, phr.phrDesc3,
            phr.groupCd, phr.type, phr.date
        ) 
        FROM ProdEntity p
        JOIN p.phrCd phr
        WHERE 
        """);

        for (int i = 0; i < wordBreak.length; i++) {
            String param = "kw" + i;
            if (i > 0) jpql.append(" OR ");
            jpql.append("(phr.phrDesc1 LIKE :").append(param)
                    .append(" OR phr.phrDesc2 LIKE :").append(param)
                    .append(" OR phr.phrDesc3 LIKE :").append(param).append(")");
        }

        // JPQL 실행
        TypedQuery<ProdDTO> query = em.createQuery(jpql.toString(), ProdDTO.class);
        for (int i = 0; i < wordBreak.length; i++) {
            query.setParameter("kw" + i, "%" + wordBreak[i] + "%");
        }
        //이거 찍으니까 쿼리나온다.
        System.out.println(jpql);
        System.out.println(query.getResultList());

        return query.getResultList();
    }

    @Override
    public List<ProdDTO> findProdByKeyword(String keyword) {

        if (keyword == null || keyword.isEmpty()) return Collections.emptyList();

        StringBuilder jpql = new StringBuilder("""
        SELECT new com.shop.dallae.dto.ProdDTO(
            p.id, p.prodCd, p.colorCd, p.sizeCd, p.price,
            phr.phrCd, phr.phrTitle, phr.phrDesc1, phr.phrDesc2, phr.phrDesc3,
            phr.groupCd, phr.type, phr.date
        ) 
        FROM ProdEntity p
        JOIN p.phrCd phr
        WHERE p.prodCd = :prodCd
        """);

        // JPQL 실행
        TypedQuery<ProdDTO> query = em.createQuery(jpql.toString(), ProdDTO.class);
        query.setParameter("prodCd", keyword);

        System.out.println(jpql);
        System.out.println(query.getResultList());

        return query.getResultList();
    }
}