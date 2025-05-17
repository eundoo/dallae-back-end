package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Column(nullable = false, unique = true)
    private String prodCd;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="img_cd", nullable = true, referencedColumnName = "imgCd")
    private ImgEntity imgCd;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="phr_cd", nullable = true, referencedColumnName = "phrCd")
    private PhrEntity phrCd;

    @Column(nullable = true)
    private String colorCd;

    @Column(nullable = true)
    private String sizeCd;

    @Column(nullable = true)
    private String price;

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
