import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;
        int adet = 0;
        // tanımlamalar
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        double ortalama = (double) toplam / adet;
        System.out.println("Ortalama: " + ortalama);
    }
}
