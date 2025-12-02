package br.com.etecia.kimcoffee;

public class Donuts {

    private int imgCardDonuts;
    private String idNomeDonuts;
    private String descCardDonuts;

    public Donuts(int imgCardDonuts, String idNomeDonuts, String descCardDonuts) {
        this.imgCardDonuts = imgCardDonuts;
        this.idNomeDonuts = idNomeDonuts;
        this.descCardDonuts = descCardDonuts;
    }

    public int getImgCardDonuts() {
        return imgCardDonuts;
    }

    public void setImgCardDonuts(int imgCardDonuts) {
        this.imgCardDonuts = imgCardDonuts;
    }

    public String getIdNomeDonuts() {
        return idNomeDonuts;
    }

    public void setIdNomeDonuts(String idNomeDonuts) {
        this.idNomeDonuts = idNomeDonuts;
    }

    public String getDescCardDonuts() {
        return descCardDonuts;
    }

    public void setDescCardDonuts(String descCardDonuts) {
        this.descCardDonuts = descCardDonuts;
    }
}
