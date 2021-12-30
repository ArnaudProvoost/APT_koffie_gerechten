package com.koffie.gerechten.model;

public class GerechtDTO {
    private String id;
    private int koffieDrankId;
    private String naam;
    private String afkomst;
    private double kcal;
    private boolean isGlutenvrij;
    private boolean isVegan;
    private boolean isVegetarisch;
    private int aantalPersonen;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getKoffieDrankId() {
        return koffieDrankId;
    }

    public void setKoffieDrankId(int koffieDrankId) {
        this.koffieDrankId = koffieDrankId;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAfkomst() {
        return afkomst;
    }

    public void setAfkomst(String afkomst) {
        this.afkomst = afkomst;
    }

    public double getKcal() {
        return kcal;
    }

    public void setKcal(double kcal) {
        this.kcal = kcal;
    }

    public boolean isGlutenvrij() {
        return isGlutenvrij;
    }

    public void setGlutenvrij(boolean glutenvrij) {
        isGlutenvrij = glutenvrij;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isVegetarisch() {
        return isVegetarisch;
    }

    public void setVegetarisch(boolean vegetarisch) {
        isVegetarisch = vegetarisch;
    }

    public int getAantalPersonen() {
        return aantalPersonen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
