import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı giriniz: ");
        n = girdi.nextInt();

        System.out.println("4 ve 5'in kuvvetleri:");

        // 4'ün kuvvetleri
        System.out.println("4'ün kuvvetleri:");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        // 5'in kuvvetleri
        System.out.println("5'in kuvvetleri:");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}
