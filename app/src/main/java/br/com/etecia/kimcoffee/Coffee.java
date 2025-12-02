package br.com.etecia.kimcoffee;

public class Coffee {

    public Coffee(int imgCardCoffee, String idNomeCoffee, String descCardCoffee) {
        this.imgCardCoffee = imgCardCoffee;
        this.idNomeCoffee = idNomeCoffee;
        this.descCardCoffee = descCardCoffee;
    }

    private String idNomeCoffee;

    public String getIdNomeCoffee() {
        return idNomeCoffee;
    }

    public void setIdNomeCoffee(String idNomeCoffee) {
        this.idNomeCoffee = idNomeCoffee;
    }

    private int imgCardCoffee;
    public int getImgCardCoffee() {
        return imgCardCoffee;
    }

    public void setImgCardCoffee(int imgCardCoffee) {
        this.imgCardCoffee = imgCardCoffee;
    }

    private String descCardCoffee;
    public String getDescCardCoffee() {
        return descCardCoffee;
    }

    public void setDescCardCoffee(String descCardCoffee) {
        this.descCardCoffee = descCardCoffee;
    }

}
