package com.bingle.fisome.repository;

import com.bingle.fisome.controller.auth.MemberRequest;
import com.bingle.fisome.controller.auth.MemberResponse;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    /**
     * 회원 정보 저장 (회원가입)
     * @param params - 회원 정보
     */
    void save(MemberRequest params);

    /**
     * 회원 상세정보 조회
     * @param email - UK
     * @return 회원 상세정보
     */
    MemberResponse findByEmail(String email);

    /**
     * 회원 정보 수정
     * @param params - 회원 정보
     */
    void update(MemberRequest params);

    /**
     * 회원 정보 삭제 (회원 탈퇴)
     * @param email - PK
     */
    void deleteById(String email);

    /**
     * 회원 수 카운팅 (ID 중복 체크)
     * @param loginId - UK
     * @return 회원 수
     */
    int countByLoginId(String loginId);

}
