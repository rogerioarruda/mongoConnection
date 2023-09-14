package com.roger.mongoconnectionspring.mongoConnectionSpring.mapper;

import com.roger.mongoconnectionspring.mongoConnectionSpring.model.Aluno;
import com.roger.mongoconnectionspring.mongoConnectionSpring.repository.AlunoEntity;

public class AlunoMapper {

    public static AlunoEntity toEntity(Aluno aluno){
        return new AlunoEntity(aluno.nome());
    }
}
