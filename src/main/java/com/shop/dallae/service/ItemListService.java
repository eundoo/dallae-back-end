package com.shop.dallae.service;

import com.shop.dallae.dto.ProdDTO;
import com.shop.dallae.repository.ProdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemListService {
    private final ProdRepository prodRepository;

    public List<ProdDTO> findProdsBySearch(String searchedWords) {

        System.out.println("findProdsBySearch");
        List<ProdDTO> prodDtoList = prodRepository.findProdsBySearch(searchedWords);

        return prodDtoList;
    }

//DTO로 쓰려고해서 findBy~ 는 쓸 수 없음 이름 바꿔야함
    public List<ProdDTO> findProdByKeyword(String keyword) {

        System.out.println("findByKeyword");
        List<ProdDTO> prodDtoList = prodRepository.findProdByKeyword(keyword);

        return prodDtoList;
    }
}
