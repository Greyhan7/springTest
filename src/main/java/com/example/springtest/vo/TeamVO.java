package com.example.springtest.vo;

import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamVO {

    private int id;
    private String name;
    private String company;
    private String debut;
    private int total;
    private String award;

    private String logo;
    @Transient
    private MultipartFile uploadFile;
}
