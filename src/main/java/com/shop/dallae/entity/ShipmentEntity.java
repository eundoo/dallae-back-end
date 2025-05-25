package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//@Data
//@NoArgsConstructor
//class ImgCdEntityPk implements Serializable {
//    private int id;
//    private String imgCd;
//}

@Entity
@Getter
@Setter
@Table(name = "dallae_shipment")
public class ShipmentEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="order_id", nullable = false, referencedColumnName = "orderId")
    private OrderEntity orderId;

    @Column(unique = true, length = 50, nullable = false)
    private String shipmentId;

    @Column(length = 50, nullable = true)
    private String remainingPeriod;

    @Column(length = 50, nullable = true)
    private String processing;
}
