package com.shop.dallae.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성자
public class ProdDTO {

    private int id;
    private String prodCd;
    private String colorCd;
    private String sizeCd;
    private String price;

    // PhrEntity 필드
    private String phrCd;
    private String phrTitle;
    private String phrDesc1;
    private String phrDesc2;
    private String phrDesc3;
    private String groupCd;
    private String type;
    private String date;
}
