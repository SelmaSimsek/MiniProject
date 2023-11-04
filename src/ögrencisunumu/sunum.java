package ögrencisunumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sunum {

    public static class MarketRunner {
        /* Basarili Market alış-veriş programı.
             *
             * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
             *          No     Ürün           Fiyat
                       ====  =======        =========
                        00   Domates         2.10 TL
                        01   Patates         3.20 TL
                        02   Biber           1.50 TL
                        03   Soğan           2.30 TL
                        04   Havuç           3.10 TL
                        05   Elma            1.20 TL
                        06   Muz             1.90 TL
                        07   Çilek           6.10 TL
                        08   Kavun           4.30 TL
                        09   Üzüm            2.70 TL
                        10   Limon           0.50 TL
             * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
             * 3. Adım: Kaç kg satın almak istediğini sorunuz.
             * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
             * 5. Başka bir ürün alıp almak istemediğini sorunuz.
             * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
             * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
             */
        public static void main(String[] args) {

            String[] products = {"Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"};
            Double[] prices = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

            List<String> shopList = new ArrayList<>();
            List<Double> payList = new ArrayList<>();


            Scanner input = new Scanner(System.in);
            double total = 0;
            int choise = 1;

            //Listeleri olustur

            for (int i = 0; i < 11; i++) {
                System.out.print((i + 1) + " " + products[i] + " ");
                System.out.print(prices[i] + " TL--");

            }
            System.out.println("");

            do {
                System.out.println("Lutfen listeden sectiginiz urunun kodunu giriniz...");
                int prd = input.nextInt();
                int productNo = prd - 1;
                System.out.println("Kac kilogram alacaksiniz?");
                int weight = input.nextInt();
                total += (prices[productNo]) * weight;

                shopList.add(products[productNo]);
                payList.add((prices[productNo]) * weight);

                System.out.println(shopList);
                System.out.println(payList);
                System.out.println("sepet tutari: " + total);

                System.out.println("Alisverise devam etmek icin 1, sonlandirmak icin 0 seciniz...");
                choise = input.nextInt();
            } while (choise != 0);

            System.out.println("Odeme yapacaginiz tutari giriniz...");
            double payment = input.nextDouble();

            if (payment > total) {
                System.out.println("para uzeri: " + (payment - total));
            } else {
                System.out.println("Odeme yeterli degildir...");
            }

            //Urun sec

            //Tutari hesapla

            //Odeme al


        }
    }
}
