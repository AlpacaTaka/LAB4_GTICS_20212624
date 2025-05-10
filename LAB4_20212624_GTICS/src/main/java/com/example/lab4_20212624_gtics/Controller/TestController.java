package com.example.lab4_20212624_gtics.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(value = "test")
    public String test() {
        return "Bienvenida";
    }

}
