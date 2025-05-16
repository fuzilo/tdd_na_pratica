package br.com.matsumura.TDD_Software.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/teste")
    public String teste(){
        return "Teste";
    }
}
