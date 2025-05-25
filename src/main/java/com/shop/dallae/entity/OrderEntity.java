package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "dallae_order")
public class OrderEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String orderId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="user_id", nullable = false, referencedColumnName = "userId")
    private UserEntity userId;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="prod_id", nullable = false, referencedColumnName = "prodId")
    private ProdEntity prodId;

    /* 참조컬럼 매핑 */
    @OneToMany(mappedBy = "orderId")
    private List<ShipmentEntity> shipments;

}
