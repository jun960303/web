package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2

public class BoardController {
    
    @GetMapping("/board/list")
    public void getList() {
        log.info("/board/list 요청");
    }
}
