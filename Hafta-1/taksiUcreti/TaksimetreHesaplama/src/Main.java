import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmBasiUcret = 2.20, minTutar = 20, acilisUcreti = 10;

        Scanner kmgirdi = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (km): ");
        double mesafe = kmgirdi.nextDouble();

        double hesaplananUcret = (kmBasiUcret * mesafe) + acilisUcreti;

        double ucret = (hesaplananUcret >= minTutar) ? hesaplananUcret : minTutar;

        System.out.println("Ödemeniz gereken tutar: " + ucret + " TL");
    }
}
