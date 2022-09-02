package com.example.devoka.controller;

import domain.CurrentTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@ControllerのアノテーションをつけることでSpringにコントロールクラスと伝える
public class IndexController {

    @GetMapping
    public String index(Model model){
        String currentTime = CurrentTime.getCurrentTime();
        model.addAttribute("message",currentTime);
        return "index";
    }

    @PostMapping("/")
    public String result(@RequestParam String country_name, Model model) {
        String countryGreeting = null;
        System.out.println(country_name);
        switch (country_name) {
            case "japan":
                countryGreeting = "こんにちは！";
                break;
            case "us":
                countryGreeting = "Hello！";
                break;
            case "china":
                countryGreeting = "ニーハオ！";
                break;
        }
        model.addAttribute("countryGreeting", countryGreeting);
        return "index";
    }
}
