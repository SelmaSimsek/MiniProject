package projeDepoFarkli;

public class Depo01 {//POJO
    //burada oncelikle urunun tanimlamasi  yapilir. id urunIsmi uretici miktar birim ve raf (6 adet fields mevcut)

    //Ürün Bilgileri
    private  static int count=1;
    private int idNo;
    private String urunAdi;
    private String ureticiFirma;
    private int urunMiktari;
    private String birim;
    private String rafAlani;

    public Depo01(int idNo, String urunAdi, String ureticiFirma, int urunMiktari, String birim, String rafAlani) {
        this.idNo = idNo;
        this.urunAdi = urunAdi;
        this.ureticiFirma = ureticiFirma;
        this.birim = birim;
        this.rafAlani = rafAlani;
        this.urunMiktari = urunMiktari;
    }


    //Getter Setter
    public Object getIdNo(int idNo) {
        count++;
        idNo=count;
        return idNo;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String getBirim() {
        return birim;
    }


    public String getRafAlani() {
        return rafAlani;
    }


    public String getUreticiFirma() {

        return ureticiFirma;
    }
    public int getUrunMiktari() {
        int max = 100;
        int min = 0;
        if (urunMiktari < min) {
            urunMiktari=min;
            return urunMiktari;
        }
        if (urunMiktari > max) {
            urunMiktari=max;

        }return urunMiktari;
    }


        @Override
        public String toString () {
            return
                    "idNo=" + idNo +
                            ", urunAdi='" + urunAdi + '\'' +
                            ", ureticiFirma='" + ureticiFirma + '\'' +
                            ", urunMiktari=" + urunMiktari +
                            ", birim='" + birim + '\'' +
                            ", rafAlani='" + rafAlani + '\'' +
                            '}';
        }


}//class sonu




