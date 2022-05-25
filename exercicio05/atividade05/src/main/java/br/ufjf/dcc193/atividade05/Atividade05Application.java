package br.ufjf.dcc193.atividade05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Atividade05Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Atividade05Application.class, args);
		JogadorRepository rep = ctx.getBean(JogadorRepository.class);

		System.out.println(rep.findAll().toString());
	}

}
