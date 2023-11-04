package basitDepoProjesi;

import java.util.*;

public class DepoServis {
    static Scanner scan = new Scanner(System.in);
    static Depo depo = new Depo();
    static Map<Integer, Depo> depoUrunListesi = new HashMap<>();
    static Set<Map.Entry<Integer, Depo>> urunMapSet = depoUrunListesi.entrySet();



    public static void yeniUrunTanimla() {


        System.out.println("Tanimlanacak ürünün adini giriniz");
        depo.setUrunAdi(scan.nextLine());

        System.out.println("Tanimlanacak ürünün üretici firmasini giriniz");
        depo.setUreticiFirma(scan.nextLine());

        System.out.println("Tanimlanacak ürünün birimini giriniz");
        depo.setBirim(scan.nextLine());


        depoUrunListesi.put(depo.getIdNo(), depo);
        Set<Map.Entry<Integer, Depo>> urunMapSet = depoUrunListesi.entrySet();
        System.out.println("                   ******    Yeni Tanimlanan Ürün Listesi    ******      ");
        System.out.println();
        System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s",
                "Id No", "Ürün Adi", "Üretici Firma", "Ürün Birimi", "Ürün Miktari", "Raf Alani\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

        for (Map.Entry<Integer, Depo> each : urunMapSet) {
            Integer key = each.getKey();
            Depo value = each.getValue();
            String valuestr = String.valueOf(value);
            String valuearr[] = valuestr.split(",");


            System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s",
                    key, valuearr[0], valuearr[1], valuearr[2], valuearr[3], valuearr[4] + "\n");
            System.out.println();
        }
    }


    public static void urunListele() {


        System.out.println("                   ******    Depoda mevcut Ürün Listesi    ******      ");
        System.out.println();
        System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s", "Id No",
                "Ürün Adi", "Üretici Firma", "Ürün Birimi", "Ürün Miktari", "Raf Alani\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------\n");
        System.out.println();

        for (Map.Entry<Integer, Depo> each : urunMapSet) {
            Integer key = each.getKey();
            Depo value = each.getValue();
            String valuestr = String.valueOf(value);
            String valuearr[] = valuestr.split(",");


            System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s",
                    key, valuearr[0], valuearr[1], valuearr[2], valuearr[3], valuearr[4]);
            System.out.println();
        }
    }

    public static void urunEkle(int idNo, int miktar) {
        System.out.println("Lütfen giris yapacaginiz ürünün id nosunu giriniz");
        idNo = scan.nextInt();
        for (Map.Entry<Integer, Depo> each : urunMapSet) {
            if (idNo == each.getKey()) {
                System.out.println("Lütfen ürünün miktarini giriniz");
                miktar = scan.nextInt();
                depo.setUrunMiktari(depo.getUrunMiktari() + miktar);

            }
            System.out.println("Ürün Id No : " + idNo);
            System.out.println("Girilen ürün miktari : " + depo.getUrunMiktari());
        }
        System.out.println("                   ******    Depoya Eklenen Ürün Listesi    ******      ");
        System.out.println();
        System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s", "Id No",
                "Ürün Adi", "Üretici Firma", "Ürün Birimi", "Ürün Miktari", "Raf Alani\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------\n");
        System.out.println();
        for (Map.Entry<Integer, Depo> each : urunMapSet) {
            Integer key = each.getKey();
            Depo value = each.getValue();
            String valuestr = String.valueOf(value);
            String valuearr[] = valuestr.split(",");


            System.out.printf("  %-5s    %-15s    %-15s       %-15s   %-15s        %-10s",
                    key, valuearr[0], valuearr[1], valuearr[2], valuearr[3], valuearr[4]);
            System.out.println();

        }
    }
}



      





