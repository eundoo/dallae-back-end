package com.shop.dallae.dto;

import com.shop.dallae.entity.CmmCdEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class CmmCdDTO {

    private int id;
    private String cmmCd;
    private String upperCd;
    private String cmmCdNm;
    private String createdUser;
    private String updatedUser;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    public static CmmCdDTO toSaveDTO(CmmCdEntity cmmCdEntity) {
        CmmCdDTO cmmCdDTO = new CmmCdDTO();
        cmmCdDTO.setCmmCd(cmmCdEntity.getCmmCd());
        cmmCdDTO.setUpperCd(cmmCdEntity.getUpperCd());
        cmmCdDTO.setCmmCdNm(cmmCdEntity.getCmmCdNm());

        return cmmCdDTO;
    }
}
