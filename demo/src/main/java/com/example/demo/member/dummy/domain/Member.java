package com.example.demo.member.dummy.domain;

import lombok.*;

@Getter
@RequiredArgsConstructor
public class Member {
    private final String id;
    private final String name;
    private final String password;
}
