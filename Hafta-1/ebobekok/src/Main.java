import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobHesapla(sayi1, sayi2);
        int ekok = ekokHesapla(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }

    // EBOB hesaplamak için metot
    private static int ebobHesapla(int a, int b) {
        while (b != 0) {
            int gecici = b;
            b = a % b;
            a = gecici;
        }
        return a;
    }

    // EKOK hesaplamak için metot
    private static int ekokHesapla(int a, int b) {
        return (a * b) / ebobHesapla(a, b);
    }
}
