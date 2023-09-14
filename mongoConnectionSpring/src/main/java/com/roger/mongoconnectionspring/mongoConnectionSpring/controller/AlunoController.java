package com.roger.mongoconnectionspring.mongoConnectionSpring.controller;

import com.roger.mongoconnectionspring.mongoConnectionSpring.model.Aluno;
import com.roger.mongoconnectionspring.mongoConnectionSpring.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid Aluno aluno) {
        alunoService.salvar(aluno);
    }
}
