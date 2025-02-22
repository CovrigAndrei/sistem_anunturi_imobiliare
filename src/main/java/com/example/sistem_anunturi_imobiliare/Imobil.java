package com.example.sistem_anunturi_imobiliare;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor  // Generează constructor cu toți parametrii
@NoArgsConstructor   // Generează constructor fără parametri
@Data

public class Imobil {
    private String tip;
    private double suprafata;
    private String adresa;
}
