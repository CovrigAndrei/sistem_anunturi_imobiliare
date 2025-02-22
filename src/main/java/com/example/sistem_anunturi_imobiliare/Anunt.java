package com.example.sistem_anunturi_imobiliare;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor  // Generează constructor cu toți parametrii
@NoArgsConstructor   // Generează constructor fără parametri
@Data               // Include @Getter, @Setter, @ToString, @EqualsAndHashCode
@RequiredArgsConstructor

public class Anunt {
    private String titlu;
    private double pret;
    private Utilizator utilizator; // Referință către utilizator
    private Imobil imobil; // Referință către imobil

    //Prin constructor
   /* @Autowired
    public Anunt(Utilizator utilizator, Imobil imobil) {
        this.utilizator = utilizator;
        this.imobil = imobil;
    }*/

    //Prin setter
    @Autowired
    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

    @Autowired
    public void setImobil(Imobil imobil) {
        this.imobil = imobil;
    }
}
