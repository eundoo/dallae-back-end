package com.shop.dallae.entity;

import com.shop.dallae.dto.CmmCdDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "dallae_cmm_cd")
public class CmmCdEntity extends AuthStampEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(length = 50, nullable = false)
    private String cmmCd;

    @Column(length = 50, nullable = true)
    private String upperCd;

    @Column(length = 50, nullable = true)
    private String cmmCdNm;

    public static CmmCdEntity toSaveEntity(CmmCdDTO cmmCdDTO) {
        CmmCdEntity cmmCdEntity = new CmmCdEntity();
        cmmCdEntity.setCmmCd(cmmCdDTO.getCmmCd());
        cmmCdEntity.setUpperCd(cmmCdDTO.getUpperCd());
        cmmCdEntity.setCmmCdNm(cmmCdDTO.getCmmCdNm());

        cmmCdEntity.createdUser = "admin";
        cmmCdEntity.updatedUser = "admin";

        return cmmCdEntity;
    }
}
