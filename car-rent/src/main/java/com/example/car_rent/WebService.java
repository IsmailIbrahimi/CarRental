package com.example.car_rent;

import org.springframework.web.bind.annotation.*;

@RestController
public class WebService {

    @GetMapping("/bonjour")
    public String disBonjour() {
        return "Bonjour !";
    }

    @GetMapping("/car")
    public Car getCar(){
        return new Car("Porsche", 2000);
    }
}
