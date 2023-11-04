package projeDepoFarkli;

import java.util.*;

//Depo Objeleri ile ilgili islemler
public class DepoServis01 {
    Scanner scan = new Scanner(System.in);

    //ürünleri bir listeye koyalim

    private List<Depo01> ürünList = new ArrayList<>();

    //ürünleri olusturup listeye ekleme

    public DepoServis01() {
        urunlerList();
    }

    private void urunlerList() {
        Depo01 urun1 = new Depo01(0, "makarna", "bizim", 0, "paket", null);
        Depo01 urun2 = new Depo01(0, "salca", "öncü", 0, "kavanoz", null);
        Depo01 urun3 = new Depo01(0, "pirinc", "tosya", 0, "kg", null);
        Depo01 urun4 = new Depo01(0, "zeytin", "marmara", 0, "kutu", null);
        Depo01 urun5 = new Depo01(0, "yumurta", "gezenTavuk", 0, "koli", null);
        Depo01 urun6 = new Depo01(0, "siviyag", "olin", 0, "litre", null);
        this.ürünList.add(urun1);
        this.ürünList.add(urun2);
        this.ürünList.add(urun3);
        this.ürünList.add(urun4);
        this.ürünList.add(urun5);
        this.ürünList.add(urun6);

    }

    public void listele() {
        System.out.println("               ****************      Ürün Listesi      *********************** ");
        System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s          \n",
                "Id No", "Ürün Adi", "Üretici Firma", "Birim", "Miktar", "RafAlani");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (Depo01 urun : ürünList) {
            System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s     \n",
                    urun.getIdNo(0), urun.getUrunAdi(),
                    urun.getUreticiFirma(),
                    urun.getBirim(),
                    urun.getUrunMiktari(),
                    urun.getRafAlani());
            System.out.println();
            System.out.println("*************************************************************************************");


        }

    }}

   /* public void urunuRafaAl() {
        Depo obj3 = new Depo();


        System.out.println("               ****************      Ürün Listesi      *********************** ");
        System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s          \n",
                "Id No","Ürün Adi","Üretici Firma","Birim","Miktar","RafAlani");
        System.out.println("-------------------------------------------------------------------------------------------");

        for(
            Depo urun :ürünList){

                System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s     \n",
                        urun.getIdNo(0), urun.getUrunAdi(),
                        urun.getUreticiFirma(),
                        urun.getBirim(),
                        urun.getUrunMiktari(),
                        urun.getRafAlani());
                System.out.println();
                System.out.println("*************************************************************************************");
            }
        System.out.println("Rafa alinacak ürün kodunu giriniz");
            idno =scan.nextInt();

        do {
            if (idno == 0) {
                System.out.println("Ana menüye yönlendiriliyorsunuz");
                break;
            } else {
                for (int i = 0; i < ürünList.size(); i++) {
                    if (idno == ürünList.indexOf(i)) {
                        ürünList.lastIndexOf(idno);
                    }


                    System.out.println("               ****************      Ürün Listesi      *********************** ");
                    System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s          \n",
                            "Id No", "Ürün Adi", "Üretici Firma", "Birim", "Miktar", "RafAlani");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.printf(" %-5s     %-15s     %-15s     %-10s     %-5s     %-5s     \n",
                            obj3.getIdNo(0),
                            obj3.getUrunAdi(),
                            obj3.getUreticiFirma(),
                            obj3.getBirim(),
                            obj3.getUrunMiktari(),
                            obj3.getRafAlani());
                    System.out.println();
                    System.out.println("*************************************************************************************");
                }
            }

        }while (true) ;
        }
    }

/* urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    public static void urunTanimla(int id, String ürün, String firma, String birim) {
        Scanner scan = new Scanner(System.in);
        Depo obj = new Depo();

        Map<String, Integer> urunid = new HashMap<>();
        Map<String, String> urunler = new HashMap<>();

        int select=-1;

            while (select!=0){
                    id = obj.getIdNo(100);
                    urunid.put("IdNo", id);
                    id++;

                    System.out.println("ürün adi giriniz");
                    obj.setUrunAdi(ürün);
                    ürün = scan.nextLine();
                    urunler.put("Ürün Adi", ürün);

                    System.out.println("üretici firma adi giriniz");
                    obj.setUreticiFirma(firma);
                    firma = scan.nextLine();
                    urunler.put("Üretici Firma", firma);

                    System.out.println("ürün birimi giriniz");
                    obj.setBirim(birim);
                    birim = scan.next();
                    urunler.put("Ürün Birimi", birim);

                    System.out.println("*****************************************************************************");
                    System.out.println();
                    System.out.printf(" %-5s     %-15s     %-15s     %-5s     \n", "Id No", "Ürün Adi", "Üretici Firma", "Birim");
                    System.out.println("------------------------------------------------------------");
                    System.out.printf(" %-5s     %-15s     %-15s     %-5s     \n", id, ürün, firma, birim);
                    System.out.println();
                    System.out.println("*******************************************************************************");

                    System.out.println();
                    System.out.println("Ana Menüye dönmek icin 0 tuslayiniz");
                    select = scan.nextInt();
            }
        }*/
        

//urunListele     ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
    /*public static void urunListele(int id, String ürün, String firma, String birim,int miktar, String rafAlani) {
        Depo obj2 = new Depo();
        Map<String, Integer> urunidUrunMiktar = new HashMap<>();
        Map<String, String> urunler = new HashMap<>();
        urunidUrunMiktar.put("Idno ",obj2.getIdNo(id));
        urunidUrunMiktar.put("Miktar",0);
        urunler.put("Ürün adi","pirinc");
        urunler.put("Üretici firma","Günebakan");
        urunler.put("Ürün birimi","kg");
        urunler.put("Ürün raf alani","A001");


        System.out.println("*****************************************************************************");
        System.out.println();
        System.out.printf(" %-5s     %-15s     %-15s     %-5s     %-5s     %-5s     \n", "Id No", "Ürün Adi", "Üretici Firma", "Birim","Miktar","Raf Alani");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf(" %-5s     %-15s     %-15s     %-5s     %-5s     %-5s     \n", id, ürün, firma, birim,miktar,rafAlani);
        System.out.println("*******************************************************************************");
        
    }*/


    /*//urunGirisi      ==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
    public static void urunGirisi(int id, String ürün, String firma, String birim,int miktari, String rafAlan) {
        Map<String, Integer> urunidUrunMiktar = new HashMap<>();
        Map<String, String> urunler = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Depo obj3 = new Depo();

        System.out.println("ürün Id No giriniz");
        obj3.getIdNo(id);
        id= scan.nextInt();
        urunidUrunMiktar.put("Ürün Miktari", id);

        System.out.println("ürün miktari giriniz");
        obj3.setMiktar(miktari);
        miktari = scan.nextInt();
        urunidUrunMiktar.put("Ürün Miktari", miktari);

        System.out.println("ürün RafAlni giriniz");
        obj3.setRafAlani(rafAlan);
        rafAlan = scan.next();
        urunler.put("Ürün RafAlani", rafAlan);

        System.out.println("*****************************************************************************");
        System.out.println();
        System.out.println("Ürün Girirsi ==>    "+"Id No : "+id + "   Ürün Girisi : "+miktari);
        System.out.printf(" %-5s     %-15s     %-15s     %-5s     %-5s     %-5s     \n", "Id No", "Ürün Adi", "Üretici Firma", "Birim","Miktar","Raf Alani");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf(" %-5s     %-15s     %-15s     %-5s     %-5s     %-5s     \n", id, ürün, firma, birim,miktari,rafAlan);
        System.out.println("*******************************************************************************");
        
    }

//urunCikisi      ==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
//     *                          urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
    public static void urunCikar(int id, String ürün, String firma, String birim,int miktari, String rafAlan) {
        Map<String, Integer> urunidUrunMiktar = new HashMap<>();
        Map<String, String> urunler = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        Depo obj4 = new Depo();

        System.out.println("ürün miktari giriniz");
        obj4.setMiktar(miktari);
        miktari += scan.nextInt();
        urunidUrunMiktar.put("Ürün Miktari", miktari);





    }*/
//class sonu











