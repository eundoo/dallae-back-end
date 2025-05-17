package com.shop.dallae.repository;

import com.shop.dallae.dto.ProdDTO;

import java.util.List;

public interface ProdRepositoryCustom {
    //검색된 키워드로 제품반환
    List<ProdDTO> findProdsBySearch(String searchedWords);

    List<ProdDTO> findProdByKeyword(String keyword);
}
