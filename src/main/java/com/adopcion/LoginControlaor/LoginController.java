package com.adopcion.LoginControlaor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping({"/"})
    public String index() {
        return "index";
    }

    @GetMapping({"/prueba"})
    public String prueba() {
        return "acercade";
    }
}
