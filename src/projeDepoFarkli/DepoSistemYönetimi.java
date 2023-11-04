package projeDepoFarkli;

import java.util.Scanner;

public class DepoSistemYönetimi {

    public static void main(String[] args) {
        getSelectMenu();

    }

    public static void getSelectMenu() {
        Scanner scan = new Scanner(System.in);

        //ürünlrt icin class olusturalim

        //depo objesini olusturalim
        DepoServis01 deposervis = new DepoServis01();


        //depo yönetim menüsünü gösterelim
        int select = -1;int max = 100;
        int min = 0;


        while (select != 0) {
            System.out.println("=====================================");
            System.out.println("...DEPO YÖNETIM SISTEMI...");
            System.out.println("1. ÜRÜN LISTELEME");
            System.out.println("2. ÜRÜN GIRISI ");
            System.out.println("3. ÜRÜNÜ RAFA YERLESTIRME");
            System.out.println("4. ÜRÜN CIKISI");
            System.out.println("0. SISTEMDEN CIKIS");
            System.out.println("=====================================");
            System.out.println("Lütfen yapmak istediginiz islemi seciniz");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    //deposervis.listele();

                case 2:
                    //DepoServis.urunGirisi

                    break;
                case 3:
                    //deposervis.urunuRafaAl();
                    break;
                case 4:
                    // DepoServis.urunCikar();

                    break;
                case 0:
                    System.out.println("Sistemden cikis yaptiniz");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyin");
                    break;
            }
        }


    }

}






