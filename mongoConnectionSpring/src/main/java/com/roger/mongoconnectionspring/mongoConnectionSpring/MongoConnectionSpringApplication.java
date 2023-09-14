package com.roger.mongoconnectionspring.mongoConnectionSpring;

import com.roger.mongoconnectionspring.mongoConnectionSpring.repository.AlunoEntity;
import com.roger.mongoconnectionspring.mongoConnectionSpring.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoConnectionSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoConnectionSpringApplication.class, args);
	}


}
