package com.example.sistem_anunturi_imobiliare;

import java.util.Objects;

public class Imobil {
    private String adresa;
    private int suprafata;
    private int nrCamere;
    private boolean mobilat;
    private double pret;

    public Imobil() {
    }

    public Imobil(String adresa, int suprafata, int nrCamere, boolean mobilat, double pret) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.nrCamere = nrCamere;
        this.mobilat = mobilat;
        this.pret = pret;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public boolean isMobilat() {
        return mobilat;
    }

    public void setMobilat(boolean mobilat) {
        this.mobilat = mobilat;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Imobil{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", nrCamere=" + nrCamere +
                ", mobilat=" + mobilat +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imobil imobil = (Imobil) o;
        return suprafata == imobil.suprafata && nrCamere == imobil.nrCamere && mobilat == imobil.mobilat && Double.compare(pret, imobil.pret) == 0 && Objects.equals(adresa, imobil.adresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adresa, suprafata, nrCamere, mobilat, pret);
    }
}
