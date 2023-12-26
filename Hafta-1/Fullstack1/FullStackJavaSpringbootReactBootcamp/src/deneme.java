import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        //Tanımlamaları Yapıyoruz.
        int mesafe, yas, tip;
        double tutar, mesafeUcret = 0.10, toplamTutar;


        //Girdi verilerini alıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi (KM cinsinden) Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk Tipini Giriniz\n1-Tek Yön\n2-Gidiş-Dönüş");
        tip = input.nextInt();

        tutar = mesafe * mesafeUcret;

        if ((mesafe > 0) && (yas > 0) && (tip == 1 || tip == 2)) {
            if (tip == 1) {
                if (yas <= 12) {
                    toplamTutar = tutar - (tutar * 0.50);
                } else if (yas > 12 && yas <= 24){
                    toplamTutar = tutar - (tutar * 0.10);
                } else if (yas > 65) {
                    toplamTutar = tutar - (tutar * 0.30);
                } else {
                    toplamTutar = tutar;
                }
            } else {
                if (yas <= 12) {
                    toplamTutar = tutar - (tutar * 0.50);
                    toplamTutar = (toplamTutar - (toplamTutar * 0.20)) * 2;
                } else if (yas > 12 && yas <= 24) {
                    toplamTutar = tutar - (tutar * 0.10);
                    toplamTutar = (toplamTutar - (toplamTutar * 0.20)) * 2;
                } else if (yas > 65) {
                    toplamTutar = tutar - (tutar * 0.30);
                    toplamTutar = (toplamTutar - (toplamTutar * 0.20)) * 2;
                } else {
                    toplamTutar = (tutar - (tutar * 0.20)) * 2;
                }
            }
            System.out.println("Toplam Ödemeniz Gereken Tutar (TL) : " + toplamTutar);
        }
        System.out.println("Hatalı Veri Girdiniz! ");
    }
}