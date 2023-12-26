import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // burada hem sayı hem de kelime kontrolünü sting veri alarak yapabiliyoruz.
        System.out.print("Bir girdi giriniz: ");
        String word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' bir palindrom yapıdır.");
        } else {
            System.out.println("'" + word + "' bir palindrom yapı değil.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Büyük-küçük harf duyarlılığını ortadan kaldır

        int length = str.length();

        // sıfırıncı karakteri al != karakter uzunluğunun bir eksiği olan son karakter ile eşit mi kontol et
        // 0 girdinin karakter sayısının yarısından büyük değil ; 0 ı bir artır
        //birinci karakteri all != ... üstteki döngünün aynısını girilen girdinin uzunluğunun yarısına kadar yap.
        // 123454321 bu 9 karakterli. 4 buçuk a kadar tekrar et demek burada 4 kere üstteki döngüyü çalıştır demek.
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
