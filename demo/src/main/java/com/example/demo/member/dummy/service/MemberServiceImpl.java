package com.example.demo.member.dummy.service;

import com.example.demo.member.dummy.dto.CreateMemberDto;
import com.example.demo.member.dummy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public int save(CreateMemberDto request) {
        return memberRepository.save(request);
    }
}
