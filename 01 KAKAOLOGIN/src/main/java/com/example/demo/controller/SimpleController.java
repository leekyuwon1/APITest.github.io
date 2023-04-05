package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class SimpleController {

    @GetMapping("/main")
    public void main(){
        log.info("URL : /main...");
    }
    @GetMapping("/login")
    public void login(){
        log.info("URL : /login...");
    }

}
