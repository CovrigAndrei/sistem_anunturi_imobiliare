package com.example.sistem_anunturi_imobiliare;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor  // Generează constructor cu toți parametrii
@NoArgsConstructor   // Generează constructor fără parametri
@Data               // Include @Getter, @Setter, @ToString, @EqualsAndHashCode

public class Utilizator {
    private String nume;
    private String email;
    private String telefon;

}
