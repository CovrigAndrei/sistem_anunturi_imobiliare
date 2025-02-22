package com.example.sistem_anunturi_imobiliare;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Utilizator utilizator() {
        return new Utilizator();
    }

    @Bean
    public Imobil imobil() {
        return new Imobil();
    }

    @Bean
    public Anunt anunt() {
        return new Anunt();
    }
}

