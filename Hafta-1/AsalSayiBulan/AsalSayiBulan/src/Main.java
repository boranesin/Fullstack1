import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi;

        System.out.println("Lütfen kontrol etmek istediğiniz sayıyı giriniz: ");
        sayi = girdi.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " sayısı asaldır.");
        } else {
            System.out.println(sayi + " sayısı asal değildir.");
        }
    }

    // Recursive asal sayı kontrolü metodu
    static boolean isAsal(int num, int i) {
        // Taban durum: 2'den küçük sayılar asal değildir.
        if (num < 2) {
            return false;
        }

        // Taban durum: num asal ise true döndür.
        if (i == num) {
            return true;
        }

        // Eğer num, i'ye bölünüyorsa asal değildir.
        if (num % i == 0) {
            return false;
        }

        // Rekürsif olarak bir sonraki sayıyı kontrol et.
        return isAsal(num, i + 1);
    }
}
