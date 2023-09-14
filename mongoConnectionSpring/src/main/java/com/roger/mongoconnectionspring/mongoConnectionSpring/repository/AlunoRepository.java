package com.roger.mongoconnectionspring.mongoConnectionSpring.repository;

import com.roger.mongoconnectionspring.mongoConnectionSpring.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<AlunoEntity, String> {
}
