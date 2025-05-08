package com.m1ddler.spring.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR() {
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManager() {
        return "view-for-managers";
    }
}
