package br.com.etecia.kimcoffee;

public class Tea {

    private int imgCardTea;
    private String idNomeTea;
    private String descCardTea;

    public Tea(int imgCardTea, String idNomeTea, String descCardTea) {
        this.imgCardTea = imgCardTea;
        this.idNomeTea = idNomeTea;
        this.descCardTea = descCardTea;
    }

    public int getImgCardTea() {
        return imgCardTea;
    }

    public void setImgCardTea(int imgCardTea) {
        this.imgCardTea = imgCardTea;
    }

    public String getIdNomeTea() {
        return idNomeTea;
    }

    public void setIdNomeTea(String idNomeTea) {
        this.idNomeTea = idNomeTea;
    }

    public String getDescCardTea() {
        return descCardTea;
    }

    public void setDescCardTea(String descCardTea) {
        this.descCardTea = descCardTea;
    }
}
