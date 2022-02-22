package com.example.htmlopgaver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/about")
    public String index(){
        return "about";
    }

    @GetMapping("/HUN_lØB_TØR_FOR_M&M's")
    public String article(){
        return "fakeNews";
    }






}
