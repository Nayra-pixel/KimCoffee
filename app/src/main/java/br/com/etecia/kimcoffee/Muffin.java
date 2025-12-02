package br.com.etecia.kimcoffee;

public class Muffin {

    public Muffin(int imgCardMuffin, String idNomeMuffin, String descCardMuffin) {
        this.imgCardMuffin = imgCardMuffin;
        this.idNomeMuffin = idNomeMuffin;
        this.descCardMuffin = descCardMuffin;
    }

    private String idNomeMuffin;

    public String getIdNomeMuffin() {
        return idNomeMuffin;
    }

    public void setIdNomeMuffin(String idNomeMuffin) {
        this.idNomeMuffin = idNomeMuffin;
    }

    private int imgCardMuffin;
    public int getImgCardMuffin() {
        return imgCardMuffin;
    }

    public void setImgCardMuffin(int imgCardMuffin) {
        this.imgCardMuffin = imgCardMuffin;
    }

    private String descCardMuffin;
    public String getDescCardMuffin() {
        return descCardMuffin;
    }

    public void setDescCardMuffin(String descCardMuffin) {
        this.descCardMuffin = descCardMuffin;
    }

}
