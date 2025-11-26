package com.example.web.member.controller;

import com.example.web.member.dto.LoginDTO;
import com.example.web.member.dto.RegisterDTO;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class MemberController {

    @GetMapping("/member/login")
    public void getLogin() {
        log.info("/member/login 요청");
    }
    // HttpSession : http 프로토콜 요청
    // 로그인, 장바구니
    // 서버 쪽에 정보저장

    // 브라우저 정보 저장
    // cookie

    @PostMapping("/member/login")
    public String postMethodName(LoginDTO dto, HttpSession session) {
        // id,password 가져오기
        log.info("로그인 post {}", dto);
        session.setAttribute("loginDto", dto);

        //

        return "redirect:/";
    }

    @GetMapping("/member/register")
    public void getRegister(RegisterDTO dto) {
        log.info("/member/register 요청");
    }

    @PostMapping("/member/register")
    public String postRegister(@Valid RegisterDTO dto, BindingResult result) {
        log.info("회원가입 요청 {}", dto);

        if (result.hasErrors()) {
            log.info("정상적으로 다시 register");
            return "/member/register";
        }

        return "redirect:/member/login";
    }
}
