package com.example.kimcoffee;

public class Coffee {

    private String idTituloCoffee;
    private int imgCardCoffee;
    private String descCardCoffee;
    private int iconCardStarCoffee;
    private int iconCardFavoriteCoffee;
    private int iconCardShareCoffee;

    public Coffee(int imgCardCoffee, String idTituloCoffee) {
        this.idTituloCoffee = idTituloCoffee;
        this.imgCardCoffee = imgCardCoffee;
        this.descCardCoffee = descCardCoffee;
        this.iconCardStarCoffee = iconCardStarCoffee;
        this.iconCardFavoriteCoffee = iconCardFavoriteCoffee;
        this.iconCardShareCoffee = iconCardShareCoffee;

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

    public int getIconCardStarCoffee() {
        return iconCardStarCoffee;
    }

    public void setIconCardStarCoffee(int iconCardStarCoffee) {
        this.iconCardStarCoffee = iconCardStarCoffee;
    }

    public int getIconCardFavoriteCoffee() {
        return iconCardFavoriteCoffee;
    }

    public void setIconCardFavoriteCoffee(int iconCardFavoriteCoffee) {
        this.iconCardFavoriteCoffee = iconCardFavoriteCoffee;
    }

    public int getIconCardShareCoffee() {
        return iconCardShareCoffee;
    }

    public void setIconCardShareCoffee(int iconCardShareCoffee) {
        this.iconCardShareCoffee = iconCardShareCoffee;
    }


}
