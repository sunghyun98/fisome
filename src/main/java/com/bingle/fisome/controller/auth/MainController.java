package com.bingle.fisome.controller.auth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login"; // templates 디렉토리에 있는 login.html을 반환
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // register.html과 매핑
    }

    // 다른 페이지로 이동할 때 유사한 메소드를 추가할 수 있습니다.

}