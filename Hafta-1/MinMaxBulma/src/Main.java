import java.util.Scanner;

public class MinMaxFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen geçerli bir pozitif sayı girin.");
            return;
        }

        int number;
        int min = 0;
        int max = 0;

        // Sayıları kullanıcıdan al ve en küçük ve en büyük sayıları bul
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            number = scanner.nextInt();

            if (i == 0) {
                min = number;
                max = number;
            } else {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        // Scanner'ı kapat
        scanner.close();
    }
}
