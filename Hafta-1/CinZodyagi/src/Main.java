import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesaplanırken doğum yılı %12 ile bölümünde kalan değere göre belirlenir.
        int zodyakIndex = dogumYili % 12;

        String cinZodyagi = getCinZodyagi(zodyakIndex);

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }

    // Çin Zodyağı burcunu döndüren yardımcı metod
    public static String getCinZodyagi(int index) {
        String[] zodyaklar = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        return zodyaklar[index];
    }
}
