package com.shop.dallae.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dallae_price")
public class PriceEntity extends AuthStampEntity{
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(length = 50, unique = true, nullable = false)
    private String price;
}
