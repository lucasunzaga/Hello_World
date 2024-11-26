package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ListaBSM")
public class ListaBSMController {

    @GetMapping
    public String ListaBSM() {
        return "Persistência,\r\n"
        		+ "Mentalidade de Crescimento,\r\n"
        		+ "Orientação ao Futuro,\r\n"
        		+ "Responsabilidade Pessoal,\r\n"
        		+ "Trabalho em Equipe,\r\n"
        		+ "Comunicação,\r\n"
        		+ "Comunicação Não Violenta,\r\n"
        		+ "Atenção para Detalhes,\r\n"
        		+ "Proatividade.";
    }
}