package br.com.matsumura.TDD_Software.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/teste")
    public String teste(){
        return "Teste";
    }

    @GetMapping("/sum/{valor1}/{valor2}")
    public Integer soma(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        return valor1 + valor2;
    }

    @GetMapping("/divide/{valor1}/{valor2}")
    public double divide(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        if(valor2 == 0){
            throw new ArithmeticException("Division by zero");
        } else

            return (double) valor1 /valor2;

    }

}
