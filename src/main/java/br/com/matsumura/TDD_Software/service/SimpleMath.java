package br.com.matsumura.TDD_Software.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

    public double sum(double v, double v1) {

        return v+v1;
    }

    public  double divide(double v, double v1) {

        if(v1 == 0){
            throw new ArithmeticException("Division by zero");
        }

        return v/v1;
    }

    public double subtract(double v, double v1) {
        return v-v1;
    }


    public double multiply(double v, double v1) {
        return v*v1;
    }
}
