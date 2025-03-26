package com.damenpa.clubes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClubesController  {

    @GetMapping("hola")

    public String hola(){
        return "alo";
    }
}




