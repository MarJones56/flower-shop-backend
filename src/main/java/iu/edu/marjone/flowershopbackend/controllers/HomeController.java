package iu.edu.marjone.flowershopbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting(){
        return "Welcome to you Guitar Inventory Management System!";
    }
}
