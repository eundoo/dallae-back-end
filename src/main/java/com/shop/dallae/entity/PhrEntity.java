package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

//여기 그냥 dallae_phr 로 테이블 명 바꿔야할 듯
//@Column(name) -> DB명과 일치
@Entity
@Getter
@Setter
@Table(name = "dallae_phr")
public class PhrEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(length = 50, unique = true, nullable = false)
    private String phrCd;

    //ImgCdEntity 의 imgCd컬럼 외래키로 사용중
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="img_cd", nullable = true, referencedColumnName = "imgCd")
    private ImgEntity imgCd;

    @Column(length = 50, nullable = false)
    private String groupCd;

    @Column(length = 50, nullable = true)
    private String phrTitle;

    @Column(length = 50, nullable = true)
    private String phrDesc1;

    @Column(length = 50, nullable = true)
    private String phrDesc2;

    @Column(length = 50, nullable = true)
    private String phrDesc3;

    @Column(length = 50, nullable = true)
    private String type;

    @Column(length = 50, nullable = true)
    private String date;
}
