package com.bingle.fisome.repository.mybatis;

import com.bingle.fisome.controller.auth.MemberRequest;
import com.bingle.fisome.controller.auth.MemberResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

    /**
     * 회원 정보 저장 (회원가입)
     *
     */
    void save(MemberRequest params);



}
