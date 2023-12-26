import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        int n;
        int total = 0;
        Scanner girdi = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            n = girdi.nextInt();
            if ( n % 2 == 1) {
                total += n;
            }
        } while ( n > 0);

        System.out.println("Toplam: " + total);
    }
}
