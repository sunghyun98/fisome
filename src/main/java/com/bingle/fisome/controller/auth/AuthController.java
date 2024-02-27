package com.bingle.fisome.controller.auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping("/api/auth/register")
    public String register(@RequestBody RegisterRequest request) {
        // 회원가입 처리 로직
        return "회원가입이 성공적으로 처리되었습니다.";
    }
}
