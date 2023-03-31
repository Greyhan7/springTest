package com.example.springtest.controller;

import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Setter
public class MainController {

    @GetMapping("/main")
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView("main");
        return mav;
    }
}
