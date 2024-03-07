package com.bingle.fisome.controller.auth;

import com.bingle.fisome.mappers.MemberMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    /**
     * 회원 정보 저장 (회원가입)
     * @param params - 회원 정보
     * @return PK
     */
    @Transactional
    public Long saveMember(final MemberRequest params) {
        System.out.println("params = " + params);
        memberMapper.save(params);
        System.out.println("params1 = " + params);
        return params.getId();
    }

}
