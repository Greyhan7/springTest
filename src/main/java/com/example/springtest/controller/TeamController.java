package com.example.springtest.controller;

import com.example.springtest.service.TeamService;
import com.example.springtest.vo.TeamVO;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Setter
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping("/team/list")
    public ModelAndView listTeam(){
        ModelAndView mav = new ModelAndView("/team/list");
        List<TeamVO> list = teamService.listTeam();

        mav.addObject("list",list);

        return mav;
    }

    @GetMapping("/team/insert")
    public ModelAndView insertTeam(){
        ModelAndView mav = new ModelAndView("/team/insert");
        return mav;
    }

    @PostMapping("/team/insert")
    public ModelAndView insertTeamSubmit(TeamVO teamVO){
        ModelAndView mav = new ModelAndView("redirect:/team/list");

        System.out.println("등록하는 팀 "+teamVO);
        System.out.println("날짜 : "+teamVO.getDebut());

        teamService.insertTeam(teamVO);
        return mav;
    }

}
