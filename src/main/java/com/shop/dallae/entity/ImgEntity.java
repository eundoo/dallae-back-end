package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

//@Data
//@NoArgsConstructor
//class ImgCdEntityPk implements Serializable {
//    private int id;
//    private String imgCd;
//}

@Entity
@Getter
@Setter
@Table(name = "dallae_img")
public class ImgEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String imgId;

    @Column(length = 50, nullable = true)
    private String imgBrandCd;

    @Column(length = 50, nullable = true)
    private String prodId;

    @Column(length = 50, nullable = true)
    private String imgDesc;

    @Column(length = 50, nullable = true)
    private String imgSrc;
}
