package DesafioFinalDio.academiadigitaldio.controller;

import DesafioFinalDio.academiadigitaldio.Service.Impl.MatriculaServiceImpl;
import DesafioFinalDio.academiadigitaldio.entity.Matricula;
import DesafioFinalDio.academiadigitaldio.form.MatriculaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }

}