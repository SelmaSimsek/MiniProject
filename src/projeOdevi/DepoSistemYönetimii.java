package projeOdevi;

import java.util.*;

public class DepoSistemYönetimii {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        anaMenü();
    }
    public static void anaMenü() throws InterruptedException {
        String secim = "";
        do{
            System.out.println("=====================================");
            System.out.println("...DEPO YÖNETIM SISTEMI...");
            System.out.println("1. ÜRÜN LISTELEME");
            System.out.println("2. ÜRÜN GIRISI ");
            System.out.println("3. ÜRÜNÜ RAFA YERLESTIRME");
            System.out.println("4. ÜRÜN CIKISI");
            System.out.println("0. ÜRÜN CIKISI");
            System.out.println("=====================================");
            System.out.println("Lütfen yapmak istediginiz islemi seciniz");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    //uruntanimla();
                    break;
                case "2":
                    DepoServis02.urunListele();
                    break;
                case "3"://urunRafaAl  //urunEkle
                    break;
                case "4"://urunCikar
                    break;
                case "0":
                case "q":
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyin");
            }
        }while (!secim.equalsIgnoreCase("q"));

        DepoSistemYönetimii.projeDurdur();
    }
    public static void projeDurdur() {
        System.out.println("Depo Yönetim Sisteminden ciktiniz");
    }

}






