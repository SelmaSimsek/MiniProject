package basitDepoProjesi;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepoUygulamasi {

    private static List<Urun> urunler = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=========================================\n" + "             DEPO UYGULAMASI" + "\n=========================================");
            System.out.println("1. Depoya Ürün Tanımlama" + "\n-----------------------------------");
            System.out.println("2. Depodaki Urunler" + "\n-----------------------------------");
            System.out.println("3. Depoya  Extra Ürün Girisi" + "\n-----------------------------------");
            System.out.println("4. Ürünü Raf Koy" + "\n-----------------------------------");
            System.out.println("5. Ürün Çıkışı" + "\n-----------------------------------");
            System.out.println("6. Çıkış" + "\n-----------------------------------");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    urunTanimlama();
                    break;
                case 2:
                    urunListele();
                    break;
                case 3:
                    urunGirisi();
                    break;
                case 4:
                    urunuRafaKoy();
                    break;
                case 5:
                    urunCikisi();
                    break;
                case 6:
                    System.out.println("Depo uygulaması kapatılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void urunTanimlama() {
        System.out.println("lutfen urun adini, ureticisini ve birmini giriniz..");
        scanner.nextLine(); // Buffer temizleme
        System.out.print("Ürün Adı: ");
        String urunIsmi = scanner.nextLine();
        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();

        System.out.print("birim: ");
        String birim = scanner.nextLine();

        System.out.println("miktar: ");
        int miktar = scanner.nextInt();

        Urun yenir = new Urun(urunIsmi, uretici, birim, miktar);
        urunler.add(yenir);


        System.out.println("Ürün tanımlandı. ID: " + yenir.getId() + miktar);
        System.out.println(miktar);


        for (Urun urun : urunler) {
            if (urun.getId() == yenir.getId()) {
                urun.setMiktar(urun.getMiktar() + miktar);


            }
        }


    }

    private static void urunListele() {
        for (Urun urun : urunler) {
            System.out.println(urun.toString());


        }
    }

    private static void urunGirisi() {
        System.out.print("Ürün ID'sini girin: ");
        int urunId = scanner.nextInt();//5

        for (Urun urun : urunler) {
            if (urun.getId() == urunId) {
                System.out.print("Giriş miktarını girin: ");
                int girisMiktari = scanner.nextInt();//100
                urun.setMiktar(urun.getMiktar() + girisMiktari);
                System.out.println("Ürün girişi yapıldı. Yeni miktar: " + urun.getMiktar());
                return;
            }
        }

        System.out.println("Ürün bulunamadı.");
    }

    private static void urunuRafaKoy() {
        System.out.print("Ürün ID'sini girin: ");
        int urunId = scanner.nextInt();

        for (Urun urun : urunler) {
            if (urun.getId() == urunId) {
                System.out.print("Raf numarasını girin: ");
                int rafNumarasi = scanner.nextInt();
                urun.setRaf(rafNumarasi);
                System.out.println("Ürün rafa koyuldu. Raf Numarası: " + urun.getRaf());
                return;
            }
        }

        System.out.println("Ürün bulunamadı.");
    }

    private static void urunCikisi() {
        System.out.print("Ürün ID'sini girin: ");
        int urunId = scanner.nextInt();

        for (Urun urun : urunler) {
            if (urun.getId() == urunId) {
                System.out.print("Çıkış miktarını girin: ");
                int cikisMiktari = scanner.nextInt();
                int yeniMiktar = urun.getMiktar() - cikisMiktari;

                if (yeniMiktar < 0) {
                    System.out.println("Çıkış miktarı mevcut miktarı aşamaz.");
                } else {
                    urun.setMiktar(yeniMiktar);
                    System.out.println("Ürün çıkışı yapıldı. Yeni miktar: " + urun.getMiktar());
                }
                return;
            }
        }

        System.out.println("Ürün bulunamadı.");


    }
}