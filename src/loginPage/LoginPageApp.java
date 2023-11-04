package loginPage;


import java.util.Scanner;

/*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                             email ve şifre birer listede tutulur.
                             aynı email kabul edilmez.

         giriş(login): email ve şifre girilir.
                       email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */
       public class LoginPageApp {
           public static void main(String[] args) {

               start();
               //tüm userlarin ortak özelliklerini tutacagimiz User classi olusturalim
               // userla ilgili islemler icin UserServuce classini oluturalim.
           }
           private static void start() {
               Scanner inp = new Scanner(System.in);
               UserService servis = new UserService();

               //menü gösterelim
               int select;
               do {
                   System.out.println("TECHPROEDUCATION");
                   System.out.println("1-Üye ol");
                   System.out.println("2-giris yap");
                   System.out.println("0-CIKIS");
                   System.out.println("Seciminiz : ");
                   select=inp.nextInt();

                   switch (select){
                       case 1 :
                           servis.register();
                           break;
                       case 2:
                          // servis.login();
                           break;
                       case 0:
                           System.out.println("Iyi günler dileriz");
                           break;
                       default:
                           System.out.println("Hatali giris, tekrar deneyinz");
                           break;
                   }


               }while(select!=0);

           }
       }
