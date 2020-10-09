package com.Smart_GLApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    //todo: Intialize this page with the other components
    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
