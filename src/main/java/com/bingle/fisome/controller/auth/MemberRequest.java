package com.bingle.fisome.controller.auth;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.thymeleaf.util.StringUtils;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {

    private int id; //회원 번호 PK
    private String username; //이름
    private String email; //메일
    private String password; //비밀번호

    public void encodingPassword(PasswordEncoder passwordEncoder) {
        if (StringUtils.isEmpty(password)) {
            return;
        }
        password = passwordEncoder.encode(password);
    }
}
