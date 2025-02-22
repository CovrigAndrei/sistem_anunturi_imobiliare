package com.example.sistem_anunturi_imobiliare;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SistemAnunturiImobiliareApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SistemAnunturiImobiliareApplication.class, args);

		// 1. Configurația Java (@Bean)
		AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(AppConfig.class);
		Anunt anuntJava = contextJava.getBean(Anunt.class);
		System.out.println("Anunț creat cu @Bean: " + anuntJava);

		// 2. Configurația XML
		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("beans.xml");
		Anunt anuntXml = contextXml.getBean(Anunt.class);
		System.out.println("Anunț creat cu xml: " + anuntXml);
	}

}
