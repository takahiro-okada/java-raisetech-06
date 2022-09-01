package com.example.devoka.controller;

import domain.CurrentTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@ControllerのアノテーションをつけることでSpringにコントロールクラスと伝える
public class indexController {

    @GetMapping
    public String index(Model model){
        String currentTime = CurrentTime.getCurrentTime();
        model.addAttribute("message",currentTime);
        return "index";
    }
}
