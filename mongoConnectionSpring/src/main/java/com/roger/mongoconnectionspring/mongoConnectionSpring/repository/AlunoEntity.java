package com.roger.mongoconnectionspring.mongoConnectionSpring.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("alunos")
public class AlunoEntity {

    @Id
    public String id;
    public String nome;

    public AlunoEntity(String nome){
        this.nome = nome;
    }
}
