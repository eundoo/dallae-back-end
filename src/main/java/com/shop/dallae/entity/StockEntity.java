package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dallae_stock")
public class StockEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String stockId;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="prod_id", nullable = false, referencedColumnName = "prodId")
    private ProdEntity prodId;

    @Column(length = 50, nullable = true)
    private String stock;
}
