package com.roger.mongoconnectionspring.mongoConnectionSpring.service;

import com.roger.mongoconnectionspring.mongoConnectionSpring.mapper.AlunoMapper;
import com.roger.mongoconnectionspring.mongoConnectionSpring.model.Aluno;
import com.roger.mongoconnectionspring.mongoConnectionSpring.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository repository;

    public void salvar(Aluno aluno) {
        repository.save(AlunoMapper.toEntity(aluno));
    }
}
