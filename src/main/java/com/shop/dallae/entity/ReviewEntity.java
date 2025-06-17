package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//A상품이 img도 담고있고 문구도 담고있어야하고 어떤 제품인지 결국에 코드로 관리되어야하는데
@Entity
@Getter
@Setter
@Table(name = "dallae_review")
public class ReviewEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String reviewId;

    @Column(length = 50, nullable = false)
    private String userId;

    @Column(length = 50, nullable = true)
    private String attachedImg1;

    @Column(length = 50, nullable = true)
    private String attachedImg2;

    @Column(length = 50, nullable = true)
    private String attachedImg3;

    @Column(length = 50, nullable = true)
    private String content;
}
