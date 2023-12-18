package com.example.demo.member.dummy.controller.rest;

import com.example.demo.member.dummy.dto.CreateMemberDto;
import com.example.demo.member.dummy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/new")
    public int create(CreateMemberDto request) {
        System.out.println("MemberController.create");
        System.out.println(request);
        return memberService.save(request);
    }
}
