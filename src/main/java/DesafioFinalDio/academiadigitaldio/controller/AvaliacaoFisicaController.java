package DesafioFinalDio.academiadigitaldio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private Long alunoId;

    private double peso;

    private double altura;

}
