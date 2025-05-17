package com.shop.dallae.controller;

import com.shop.dallae.dto.CmmCdDTO;
import com.shop.dallae.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/save")
    public String save(@ModelAttribute CmmCdDTO cmmCdDTO) {
        boardService.save(cmmCdDTO);
        return "index";
    }

    @GetMapping("/")
    public String findAll(Model model) {
        List<CmmCdDTO> cmmCdDTOList = boardService.findAll();
        model.addAttribute("boardList", cmmCdDTOList);
        return "list";
    }
//    @GetMapping("hello")
//    public String hello(Model model) {
//        model.addAttribute("data", "몰라!!");
//        return "hello";
//    }
//
//    @GetMapping("hello-mvc")
//    public String helloMvc(@RequestParam("name") String name, Model model) {
//        model.addAttribute("name", name);
//        return "hello-template";
//    }
//
//    @GetMapping("hello-string")
//    @ResponseBody
//    public String helloString(@RequestParam("name") String name) {
//        return "hello" + name;
//    }
//
//    @GetMapping("hello-api")
//    @ResponseBody
//    public Hello helloApi(@RequestParam("name") String name) {
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//    }
//
//    static class Hello {
//        private String name;
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
}
