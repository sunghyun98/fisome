package com.bingle.fisome.controller.auth;

import lombok.Data;

@Data
public class MemberRequest {
    private Long id; //회원 번호 PK
    private String username; //이름
    private String email; //메일
    private String password; //비밀번호


    //비밀번호 암호화

}
