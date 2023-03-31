package com.example.springtest.service;

import com.example.springtest.db.DBManager;
import com.example.springtest.vo.TeamVO;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
public class TeamService {



    public List<TeamVO> listTeam(){
        return DBManager.findAllTeam();
    }

}
