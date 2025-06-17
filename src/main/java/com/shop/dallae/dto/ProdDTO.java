package com.shop.dallae.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class ProdDTO {

    private int id;
    private String prodId;
    private String prodSn;
    private String prodNm;
    private String price;
    private String colorCd;
    private String sizeCd;
    private String prodTypeCd;

    // PhrEntity 필드
    private String phrId;
    private String phrTitle;
    private String phrDesc1;
    private String phrTypeCd;
    private String date;
}
