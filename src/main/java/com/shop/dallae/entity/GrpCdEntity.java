package com.shop.dallae.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "dallae_grp_cd")
public class GrpCdEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(length = 50, nullable = false)
    private String groupCd;

    @Column(length = 50, nullable = true)
    private String cdDesc;
}
