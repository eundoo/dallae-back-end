package com.shop.dallae.repository;

import com.shop.dallae.entity.ProdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepository extends JpaRepository<ProdEntity, Long>, ProdRepositoryCustom {

    //@Query로 사용하고 싶을 때
//    @Query(value = """
//        SELECT * FROM dallae_phr
//        WHERE phr_desc1 LIKE %:kw1% OR phr_desc2 LIKE %:kw1% OR phr_desc3 LIKE %:kw1%
//           OR phr_desc1 LIKE %:kw2% OR phr_desc2 LIKE %:kw2% OR phr_desc3 LIKE %:kw2%
//        """, nativeQuery = true)
//    List<ProdEntity> searchByTwoKeywords(@Param("kw1") String kw1, @Param("kw2") String kw2);


}
