package com.example.kimcoffee;

public class Coffee {

    private String idTituloCoffee;
    private int imgCardCoffee;
    private String descCardCoffee;

    public Coffee(int imgCardCoffee, String idTituloCoffee, String descCardCoffee) {
        this.idTituloCoffee = idTituloCoffee;
        this.imgCardCoffee = imgCardCoffee;
        this.descCardCoffee = descCardCoffee;

    }

    public String getIdTituloCoffee() {
        return idTituloCoffee;
    }

    public void setIdTituloCoffee(String idTituloCoffee) {
        this.idTituloCoffee = idTituloCoffee;
    }

    public int getImgCardCoffee() {
        return imgCardCoffee;
    }

    public void setImgCardCoffee(int imgCardCoffee) {
        this.imgCardCoffee = imgCardCoffee;
    }

    public String getDescCardCoffee() {
        return descCardCoffee;
    }

    public void setDescCardCoffee(String descCardCoffee) {
        this.descCardCoffee = descCardCoffee;
    }

}
