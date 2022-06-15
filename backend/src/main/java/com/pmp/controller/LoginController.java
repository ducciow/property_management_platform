package com.pmp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: duccio
 * @Date: 15, 06, 2022
 * @Description:
 */

@RestController
public class LoginController {

    @RequestMapping("/auth/login")
    public String login() {
        System.out.println("request received");
        return "success";
    }

}
