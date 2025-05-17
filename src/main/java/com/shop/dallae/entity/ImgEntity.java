package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

//@Data
//@NoArgsConstructor
//class ImgCdEntityPk implements Serializable {
//    private int id;
//    private String imgCd;
//}

//여기 그냥 dallae_img 로 테이블 명 바꿔야할 듯
@Entity
@Table(name = "dallae_img")
public class ImgEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    //유니크 중복허용X 외래키로 참조중
    @Column(unique = true, length = 50, nullable = false)
    private String imgCd;

    @Column(length = 50, nullable = false)
    private String groupCd;

    @Column(length = 50, nullable = true)
    private String imgSrc;
}
