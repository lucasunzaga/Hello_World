package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosController {

    @GetMapping
    public String Objetivos() {
        return "Aprender mais sobre Banco de dados,\r\n"
        		+ "Aprender mais sobre os conteúdos das provas da faculdade pra tirar nota boa,\r\n"
        		+ "Aprender mais sobre Back-End,\r\n"
        		+ "Aprender mais sobre Front-End.";
    }
}