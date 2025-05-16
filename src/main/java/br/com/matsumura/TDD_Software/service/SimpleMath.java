package br.com.matsumura.TDD_Software.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

    public double sum(double v, double v1) {

        return v+v1;
    }
}
