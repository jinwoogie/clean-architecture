package com.example.demo.member.dummy.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberViewController {

    @GetMapping("/")
    public String hello() {
        return "redirect:/members";
    }

    @GetMapping("/members")
    public String createForm() {
        return "members/createMemberForm";
    }
}
