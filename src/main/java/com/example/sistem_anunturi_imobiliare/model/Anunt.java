package com.example.sistem_anunturi_imobiliare.model;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@AllArgsConstructor  // Generează constructor cu toți parametrii
@NoArgsConstructor   // Generează constructor fără parametri
@Data               // Include @Getter, @Setter, @ToString, @EqualsAndHashCode
@RequiredArgsConstructor

public class Anunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titlu;
    private double pret;
    @ManyToOne
    private Utilizator utilizator;
    @ManyToOne
    private Imobil imobil;

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

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public Imobil getImobil() {
        return imobil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
