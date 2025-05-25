package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dallae_like")
public class LikeEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String likeId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="prod_id", nullable = false, referencedColumnName = "prodId")
    private ProdEntity prodId;

    @Column(nullable = true)
    private String likeCnt;
}
