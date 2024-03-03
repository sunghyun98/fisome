
여기가 수정된 코드입니다.

        java
        Copy code
        package com.bingle.fisome.service;

import com.bingle.fisome.controller.auth.MemberRequest;
import com.bingle.fisome.repository.MemberMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;
    private final PasswordEncoder passwordEncoder;

    /**
     * 회원 정보 저장 (회원가입)
     * @param params - 회원 정보
     * @return PK
     */
    @Transactional
    public int saveMember(final MemberRequest params) {
        params.encodingPassword(passwordEncoder);
        return memberMapper.save(params);
    }
}