package com.example.demo.controllers;

import com.example.demo.services.CvsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {

    @GetMapping("/loadInMemory")
    public String loadInMemory(){
        return new CvsService().processCVS();
    }
}
