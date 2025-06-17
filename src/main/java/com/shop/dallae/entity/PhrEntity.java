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

    @Column(unique = true, length = 50, nullable = false)
    private String phrId;

    @Column(length = 50, nullable = false) 
    private String phrTitle;

    @Column(length = 50, nullable = false)
    private String phrTypeCd;

    @Column(length = 50, nullable = true)
    private String phrDesc;

    @Column(length = 50, nullable = true)
    private String date;
}
