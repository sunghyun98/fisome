package com.bingle.fisome.model;

import lombok.Data;

@Data
public class MemberVo {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String snsProvider;
    private String snsId;
    private int gradeId;
}