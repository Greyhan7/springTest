package com.example.springtest.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
    private int id;
    private int team;
    private String name;
    private int height;
    private int weight;
    private String mbti;
    private String role;
    private MultipartFile uploadFile;
    private String portrait;
}
