package com.bingle.fisome.mappers;

import com.bingle.fisome.controller.auth.MemberRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    /**
     * 회원 정보 저장 (회원가입)
     *
     */
    void save(MemberRequest params);

}
