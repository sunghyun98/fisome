package com.bingle.fisome.controller.auth;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberResponse {
    private Long id;                       // 회원 번호 (PK)
    private String username;                // 이름
    private String email;               // 메일
    private String password;                   // 비밀번호
    private LocalDateTime createdDate;     // 생성일시

}
