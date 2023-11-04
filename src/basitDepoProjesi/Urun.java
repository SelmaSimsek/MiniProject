package basitDepoProjesi;

public class Urun {

    private static int idCounter = 1;
    private int id;
    private String urunIsmi;
    private String uretici;
    private String birim;
    private int miktar;
    private int raf;

    public Urun(String urunIsmi, String uretici, String birim, int miktar) {
        this.id = idCounter++;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.birim = birim;
        this.miktar = 0; // Yeni ürünlerin miktarı varsayılan olarak 0
        this.raf = -1;  // Raf numarası varsayılan olarak -1 (rafa koyulmamış)
    }

// Diğer getter ve setter metotlarını ekleyebilirsiniz


    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public String getBirim() {
        return birim;
    }

    public int getMiktar() {
        return miktar;
    }

    public int getRaf() {
        return raf;
    }

    public static void setIdCounter(int idCounter) {
        Urun.idCounter = idCounter;
    }

    public void setId() {
        this.id = id;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Ürün Adı: " + urunIsmi +
                ", Üretici: " + uretici +
                ", Birim: " + birim +
                ", Miktar: " + miktar +
                ", Raf Numarası: " + (raf == -1 ?
                "Rafa Konulmadı" : raf);
    }


}
