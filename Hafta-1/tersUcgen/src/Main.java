import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        // Ters üçgeni çiz
        for (int i = 0; i < basamakSayisi; i++) {
            // Boşlukları ekle
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 0; k < 2 * (basamakSayisi - i) - 1; k++) {
                System.out.print("*");
            }

            // Bir satır atla
            System.out.println();
        }

        scanner.close();
    }
}
