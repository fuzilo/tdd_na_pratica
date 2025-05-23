package br.com.matsumura.TDD_Software.controllers;

import br.com.matsumura.TDD_Software.service.SimpleMath;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();

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
        return math.divide(valor1,valor2);
    }

    @GetMapping("/subtract/{valor1}/{valor2}")
    public double subtract(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        return math.subtract(valor1, valor2);
    }

    @GetMapping("/multiply/{valor1}/{valor2}")
    public double multiply(
            @PathVariable int valor1,
            @PathVariable int valor2
    ){
        return math.multiply(valor1, valor2);
    }
}
