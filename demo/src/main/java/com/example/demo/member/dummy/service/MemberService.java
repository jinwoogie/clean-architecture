package com.example.demo.member.dummy.service;

import com.example.demo.member.dummy.dto.CreateMemberDto;
import org.springframework.stereotype.Service;

public interface MemberService {
    int save(CreateMemberDto request);

}
