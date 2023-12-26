import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;

        while (devam) {
            // 1. Adım: Kullanıcıdan iki sayı al
            System.out.print("Taban sayıyı girin: ");
            int tabanSayi = scanner.nextInt();

            System.out.print("Üs sayıyı girin: ");
            int usSayi = scanner.nextInt();

            // 2. Adım: Üs bulma methoduna iki sayıyı gönder
            int sonuc = usBul(tabanSayi, usSayi);

            // 3. Adım: Methodun sonucunu ekrana yazdır
            System.out.println("Sonuç: " + sonuc);

            // 4. Adım: Kullanıcıdan devam edip etmeyeceğini sorma
            System.out.print("Başka bir hesaplama yapmak istiyor musunuz? (Evet/Hayır): ");
            String devamSecimi = scanner.next().toLowerCase();

            // 5. Adım: Kullanıcının devam etme isteğine göre döngüyü kontrol et
            devam = devamSecimi.equals("evet");
        }

        // 6. Adım: Programı kapat
        scanner.close();
    }

    // 7. Adım: Üs bulma recursive methodu
    private static int usBul(int taban, int us) {
        // Recursive çıkış koşulu
        if (us == 0) {
            return 1;
        } else {
            // Recursive çağrı
            return taban * usBul(taban, us - 1);
        }
    }
}
