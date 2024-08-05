package com.krishna.quantumconnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page Handler");
        model.addAttribute("name", "Krishna Kumar");
        model.addAttribute("github", "009-KumarJi");
        model.addAttribute("university", "DAVV, Indore, MP");
        return "home";
    }
}
