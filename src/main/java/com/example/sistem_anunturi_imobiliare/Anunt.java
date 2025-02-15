package com.example.sistem_anunturi_imobiliare;

import java.util.Objects;

public class Anunt {
    private String titlu;
    private double pret;

    public Anunt() {
    }

    public Anunt(String titlu, double pret) {
        this.titlu = titlu;
        this.pret = pret;
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

    @Override
    public String toString() {
        return "Anunt{" +
                "titlu='" + titlu + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anunt anunt = (Anunt) o;
        return Double.compare(pret, anunt.pret) == 0 && Objects.equals(titlu, anunt.titlu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, pret);
    }
}
