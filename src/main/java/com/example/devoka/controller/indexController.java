package com.example.devoka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@ControllerのアノテーションをつけることでSpringにコントロールクラスと伝える
public class indexController {

    @GetMapping
    public String index(){
        return "index";
    }
}
