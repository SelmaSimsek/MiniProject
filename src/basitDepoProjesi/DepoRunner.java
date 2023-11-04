package basitDepoProjesi;

import java.util.Scanner;

public class DepoRunner {
   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        anaMenu();

    }// main method sonu

    public static void anaMenu(){

        String secim = "";
        do{
            System.out.println();
            System.out.println("=====================================");
            System.out.println("...DEPO YÖNETIM SISTEMI...");
            System.out.println("1. ÜRÜN TANIMLAMA");
            System.out.println("2. ÜRÜN LISTELEME");
            System.out.println("3. ÜRÜN GIRISI ");
            System.out.println("4. ÜRÜNÜ RAFA ALMA");
            System.out.println("5. ÜRÜN CIKISI");
            System.out.println("Q. SISTEM CIKISI");
            System.out.println("=====================================");
            System.out.println("Lütfen yapmak istediginiz islemi seciniz");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    DepoServis.yeniUrunTanimla();
                    break;
                case "2":
                    DepoServis.urunListele();
                    break;
                case "3":
                    DepoServis.urunEkle(100,0);
                    break;
                case "4":
                   // DepoServis.urunRafaAl();
                    break;
                case "5":
                   // DepoServis.urunCikar();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyin");
                    break;
            }
        }while (!secim.equalsIgnoreCase("q"));

        projeDurdur();
    }
    public static void projeDurdur() {
        System.out.println("Depo Yönetim Sisteminden çıkış yaptınız");
    }


}//class sonu
