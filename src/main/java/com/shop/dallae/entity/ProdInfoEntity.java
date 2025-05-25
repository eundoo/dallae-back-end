package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "dallae_prod_info")
public class ProdInfoEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private int prodInfoId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="prod_id", nullable = false, referencedColumnName = "prodId")
    private ProdEntity prodId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="img_id", nullable = false, referencedColumnName = "imgId")
    private ImgEntity imgId;
}
