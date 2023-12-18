package com.example.demo.member.dummy.repository;

import com.example.demo.member.dummy.dto.CreateMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public int save(CreateMemberDto request) {
        System.out.println(request);

        String sql = "INSERT INTO Member(name, password) VALUES (?, ?)";
        return jdbcTemplate.update(sql, request.name(), request.password());
    }
}
