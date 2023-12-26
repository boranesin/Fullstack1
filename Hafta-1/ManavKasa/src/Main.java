import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fiyatları aldık
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        // Meyve ağırlıklarını aldıl
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesabını
        double toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);

        // Sonucu yazdırıy %.2f ile virgüldenn
        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");

        // Scanner'ı kapat
        scanner.close();
    }
}
