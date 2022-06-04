package DesafioFinalDio.academiadigitaldio.controller;

import DesafioFinalDio.academiadigitaldio.Service.Impl.AlunoServiceImpl;
import DesafioFinalDio.academiadigitaldio.entity.Aluno;
import DesafioFinalDio.academiadigitaldio.entity.AvaliacaoFisica;
import DesafioFinalDio.academiadigitaldio.form.AlunoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                      String dataDeNacimento){
        return service.getAll(dataDeNacimento);
    }


}
