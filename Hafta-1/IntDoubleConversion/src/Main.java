import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<Bir tam sayı giriniz: ");
        int sayiInt = scanner.nextInt();
        System.out.print("<Bir ondalıklı sayı giriniz: ");
        double sayiDouble = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürme
        double tamSayiToOndalikli = (double) sayiInt;

        // Ondalıklı sayıyı tam sayıya dönüştürme
        int ondalikliToTamSayi = (int) sayiDouble;

        // Sonuçları ekrana yazdırma
        System.out.println("Girilen Tam Sayı: " + sayiInt);
        System.out.println("Girilen Ondalıklı Sayı: " + sayiDouble);
        System.out.println("Tam Sayıyı Ondalıklı Sayıya Dönüştürüldü: " + tamSayiToOndalikli);
        System.out.println("Ondalıklı Sayıyı Tam Sayıya Dönüştürüldü: " + ondalikliToTamSayi);

        // Scanner'ı kapat
        scanner.close();
    }
}