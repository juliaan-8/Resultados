package com.example.Resultados.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultadoControllers {
    @GetMapping("/resultado/{numero}")
    public String mostrarResultado (@PathVariable Float numero)
    {
        return "El resultado es " + numero;
    }
}
