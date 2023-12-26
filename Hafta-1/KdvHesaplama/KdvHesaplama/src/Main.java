import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      // Kullanıcıdan para değerini isteyin
      System.out.print("Lütfen para değerini girin (TL): ");
      double fiyat = scanner.nextDouble();

      // KDV oranını belirle
      double kdvOrani = (fiyat > 1000) ? 0.08 : 0.18;

      // KDV'li fiyatı hesapla
      double kdvliFiyat = fiyat + (fiyat * kdvOrani);

      // KDV tutarını hesapla
      double kdvTutari = fiyat * kdvOrani;

      // Sonuçları ekrana bastır
      System.out.println("Girilen para değeri: " + fiyat + " TL");
      System.out.println("KDV Oranı: %" + (kdvOrani * 100));
      System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
      System.out.println("KDV Tutarı: " + kdvTutari + " TL");

      // Scanner'ı kapat
      scanner.close();
   }
}
