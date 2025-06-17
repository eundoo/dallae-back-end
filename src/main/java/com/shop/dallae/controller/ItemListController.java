package com.shop.dallae.controller;

import com.shop.dallae.dto.ProdDTO;
import com.shop.dallae.service.ItemListService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller만 쓰면 안된대 왜? 알아보자
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/list")
public class ItemListController {
    private final ItemListService itemListService;

    public ItemListController(ItemListService itemListService) {
        this.itemListService = itemListService;
    }

    //GetMapping이랑 의도전달측면 차이가있고 똑같은거래
    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    @ResponseStatus(value = HttpStatus.OK)
    public List<ProdDTO> findProdsByWords(@RequestParam String searchedWords) {

//        searchedWords = "신상 아우터";

        List<ProdDTO> prodDTOList = itemListService.findProdsBySearch(searchedWords);

        ProdDTO test = new ProdDTO();
        test.setId(1234);

        prodDTOList.add(test);

        return prodDTOList;
    }

    @RequestMapping(value = "/keyword", method = RequestMethod.GET)
    public String findProdByKeyword(Model model) {

        String keyword = "1";

        List<ProdDTO> prodDTOList = itemListService.findProdByKeyword(keyword);
        model.addAttribute("prodDTOList", prodDTOList);
        return "hello";
    }
}