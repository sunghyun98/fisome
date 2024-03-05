package com.bingle.fisome.controller.auth;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.thymeleaf.util.StringUtils;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRequest {

    private Long id; //회원 번호 PK
    private String username; //이름
    private String email; //메일
    private String password; //비밀번호

    //비밀번호 암호화
    public void encodingPassword(PasswordEncoder passwordEncoder) {
        if (StringUtils.isEmpty(password)) {
            return;
        }
        password = passwordEncoder.encode(password);
    }
}
