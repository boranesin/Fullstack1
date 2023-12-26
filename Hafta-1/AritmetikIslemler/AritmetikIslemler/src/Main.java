import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a, b, c, sonuc;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen a b ve c değerleri için 3 adet giriş yapınız: ");
        a = girdi.nextInt();
        b = girdi.nextInt();
        c = girdi.nextInt();
        sonuc = a + b * c - b;
        System.out.println(sonuc);
    }
}
