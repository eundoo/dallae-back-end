package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//A상품이 img도 담고있고 문구도 담고있어야하고 어떤 제품인지 결국에 코드로 관리되어야하는데
@Entity
@Getter
@Setter
@Table(name = "dallae_prod")
public class ProdEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String prodId;

    @Column(unique = true, length = 50, nullable = false)
    private String prodSn;

    @Column(length = 50, nullable = true)
    private String prodNm;

    @Column(length = 50, nullable = true)
    private String price;

    @Column(length = 50, nullable = true)
    private String colorCd;

    @Column(length = 50, nullable = true)
    private String sizeCd;

    @Column(length = 50, nullable = true)
    private String prodTypeCd;

    /* 참조컬럼 매핑 */
    @OneToMany(mappedBy = "prodId")
    private List<CartEntity> carts;

    @OneToOne(mappedBy = "prodId")
    private LikeEntity likes;

    @OneToOne(mappedBy = "prodId")
    private StockEntity stocks;

    @OneToMany(mappedBy = "prodId")
    private List<OrderEntity> orders;

//    public static ProdEntity toSaveEntity(ProdDTO prodDTO) {
//        ProdEntity prodEntity = new ProdEntity();
//        prodEntity.setProdCd(prodDTO.getProdCd());
//        prodEntity.setImgCd(prodDTO.getImgCd());
//        prodEntity.setPhrCd(prodDTO.getPhrCd());
//        prodEntity.setColorCd(prodDTO.getColorCd());
//        prodEntity.setSizeCd(prodDTO.getSizeCd());
//        prodEntity.setPrice(prodDTO.getPrice());
//
//        prodEntity.createdUser = "admin";
//        prodEntity.updatedUser = "admin";
//
//        return prodEntity;
//    }
}
