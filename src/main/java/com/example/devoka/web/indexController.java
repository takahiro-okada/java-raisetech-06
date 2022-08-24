package com.example.devoka.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ControllerのアノテーションをつけることでSpringにコントロールクラスと伝える
public class indexController {

    @GetMapping
    @ResponseBody
    public String index(){
        return "<h1>Hello World!</h1>";
    }
}
