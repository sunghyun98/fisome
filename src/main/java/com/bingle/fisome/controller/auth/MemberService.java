package com.bingle.fisome.controller.auth;

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
    public Long saveMember(final MemberRequest params) {
        params.encodingPassword(passwordEncoder);
        memberMapper.save(params);
        return params.getId();
    }

}
