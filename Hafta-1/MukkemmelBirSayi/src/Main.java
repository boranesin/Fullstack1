import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;

        System.out.println("Lütfen kontrol etmek istediğiniz sayıyı giriniz");

        sayi = girdi.nextInt();

        boolean sonuc = mukemmelSayiKontrol(sayi);

        if (sonuc) {
            System.out.println(sayi + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel bir sayı değildir.");
        }
    }

    static boolean mukemmelSayiKontrol(int sayi) {
        int toplam = 0;

        // 1'den başlayarak sayıya kadar olan pozitif bölenleri bul ve topla
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Toplam sayıya eşitse mükemmel sayıdır
        return (toplam == sayi);
    }
}
