package biletRezervasyonApp;

public class Ticket {
    //4.mesafe(km), koltuk no, fiyat, yolculuk tipi

    public double distance;
    public int typeNo;
    public String seatNo;
    private double price;// verilen bilgilere göre hesaplanacak


    //5.bilet fiyatini heaplama
    public void getTotalPrice(int age){
        double total=0;
        int seat=Integer.parseInt(this.seatNo);
        switch (this.typeNo){

            case 1: //tek yön
                if (seat%3==0){
                    total=this.distance*1.2;
                }else {
                    total=this.distance*1;

                }
                System.out.println("Toplam Tutar : "+total);

                break;
            case 2://cift yön: gidis dönüs
                if (seat%3==0){
                    total=this.distance*2.4;
                }else {
                    total=this.distance*2;

                }
                System.out.println("Toplam Tutar : "+total);

                break;
        }

        //son tutardan yas indirimi
        if (age<12){
            total=total*0.5;
            System.out.println("12 yas alti indirimli Toplam Tutar : "+total);
        }else if (age>65){
            total=total*0.7;
            System.out.println("65 yas üstü indirimli Toplam Tutar : "+total);
        }
        this.price=total;

    }


    //6.bileti yazdiralim
    public void printTicket(){
        System.out.println("*".repeat(42));
        System.out.println("---Bilet Detayi---");
        System.out.println("Otobüs Plakasi    ");
        System.out.println("Mesafe            "+ this.distance);
        System.out.println("Yolculuk Tipi     "+(this.typeNo==1?"Tek Yön" : "Gidis Dönüs"));
        System.out.println("Koltuk NO         "+this.seatNo);
        System.out.println("Toplam Tutar      "+this.price);
        System.out.println("Keyifli yolculuklar dileriz...");
        System.out.println("*".repeat(42));

    }

}
