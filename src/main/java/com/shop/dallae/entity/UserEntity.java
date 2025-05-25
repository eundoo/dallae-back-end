package com.shop.dallae.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "dallae_user")
public class UserEntity extends AuthStampEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String userId;

    @Column(unique = true, length = 50, nullable = false)
    private String pwd;

    @Column(nullable = true)
    private String userNkNm;

    @Column(nullable = true)
    private String userEmail;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private String addressDtl;

    /* Prod prod = prodRepository.findById(1L);
       List<ProdImg> imageList = prod.getImages(); ← 이게 가능하려면 OneToMany 필요*/

    /* 참조컬럼 매핑 */
    @OneToMany(mappedBy = "userId")
    private List<CartEntity> carts;

    @OneToMany(mappedBy = "userId")
    private List<OrderEntity> orders;
}
