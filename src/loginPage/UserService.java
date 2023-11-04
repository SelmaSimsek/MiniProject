package loginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> emails = new ArrayList<>();
    List<String> passwords = new ArrayList<>();
    //List<User> user =new ArrayList<>();

    //2-ad soyad, email, sifre alip listeye kaydedelim
    public void register() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Ad Soyad giriniz");
        String name = inp.nextLine();

        //email gecersiz ise tekrar girilmeli
        String email;
        boolean isValid;
        boolean isExistEmail;

        do {
            System.out.println("Email giriniz : ");
            email=inp.nextLine();
            isValid = validateEmail(email);
            isExistEmail = this.emails.contains(email);
            if (isExistEmail){
                System.out.println("Bu email ile kayitli kullanici zaten var");
                isValid= false;
            }

        }while(isValid);

    }

   private boolean validateEmail(String email) {
        boolean isValid;
        boolean space= email.contains(" ");
        boolean containsAt = email.contains("@");

        if (space){
            System.out.println("Email bosluk iceremez!");
            isValid = false;
        } else if (!containsAt) {
            System.out.println("Email @ sembolünü icermelidir");
            isValid = false;
        } else {
           String firstPart = email.split("@")[0];
           String secondPart = email.split("@")[1];

           //harf-rakam ve -._disinda karakter var mi?
            int notValidCharLenght = firstPart.replaceAll("[a-zA-Z0-9]","").length();
            boolean checkStart = notValidCharLenght==0;
            boolean checkEnd= secondPart.equals("gmail.com");


        }

            System.out.println("Girdiginiz email basarili");


       return true;

   }

   private boolean validatePassword(String password){
        if (password.contains(" ")){
           System.out.println("Sifre bosluk ");

       }

    return true;
   }





}
