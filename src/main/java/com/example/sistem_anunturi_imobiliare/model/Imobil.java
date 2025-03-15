package com.example.sistem_anunturi_imobiliare.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor  // Generează constructor cu toți parametrii
@NoArgsConstructor   // Generează constructor fără parametri
@Data

public class Imobil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tip;
    private double suprafata;
    private String adresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(double suprafata) {
        this.suprafata = suprafata;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
