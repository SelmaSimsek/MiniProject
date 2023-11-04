package basitDepoProjesi;

public class Depo {
    static int count=100;
    private int idNo;
    private String urunAdi;
    private String ureticiFirma;
    private String birim;
    private int urunMiktari;
    private int rafAlani;



    public Depo() {
    }// parametreli constructor olusturuldugunda, defaul cons. silindigi icin parametresiz cons

    public Depo(int idNo, String urunAdi, String ureticiFirma, String birim, int urunMiktari, int rafAlani) {
        this.idNo=idNo;
        this.urunAdi = urunAdi;
        this.ureticiFirma = ureticiFirma;
        this.birim = birim;
        this.urunMiktari = urunMiktari;
        this.rafAlani = rafAlani;
    }


    //Getter ve setter



    public int getIdNo() {
        count++;
        idNo=count;
        return idNo;
    }

    public void setIdNo() {
        this.idNo = idNo;
    }

    public String getUrunAdi() {
        return urunAdi;
    }
    public String getUreticiFirma() {
        return ureticiFirma;
    }
    public int getUrunMiktari() {
        return urunMiktari;
    }
    public String getBirim() {
        return birim;
    }

    public int getRafAlani() {
        return rafAlani;
    }


    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public void setUrunMiktari(int urunMiktari) {
        if (urunMiktari <= 0) {
            System.out.println("Miktar 0 dan büyük olmalidir");
        } else {
            this.urunMiktari = urunMiktari;
        }
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRafAlani(int rafAlani) {
        this.rafAlani = rafAlani;
    }


    @Override
    public String toString() {
        return
                 /*idNo +", "+*/
                  urunAdi +", "+
                 ureticiFirma +","+
                birim +", "+ urunMiktari +", "+
                rafAlani;
    }
}//class sonu
