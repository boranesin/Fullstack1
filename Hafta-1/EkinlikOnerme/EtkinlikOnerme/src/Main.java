import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int girilenDeger;

        System.out.print("Bir tam sayı girin: ");
        girilenDeger = girdi.nextInt();
        
            // burada her bir koşulu kontrol ediyoruz
            if (girilenDeger >= 0 && girilenDeger <= 10) {
                System.out.println("Girilen değer a koşulunu sağlıyor.");
            }

            if (girilenDeger >= 5 && girilenDeger <= 15) {
                System.out.println("Girilen değer b koşulunu sağlıyor.");
            }

            if (girilenDeger >= 10 && girilenDeger <= 25) {
                System.out.println("Girilen değer c koşulunu sağlıyor.");
            }

            // Hiç bir koşulu sağlamamasını kontrol ediyoruz
            if (!(girilenDeger >= 0 && girilenDeger <= 10) && !(girilenDeger >= 5 && girilenDeger <= 15) && !(girilenDeger >= 10 && girilenDeger <= 25)) {
                System.out.println("Girilen değer hiçbir koşulu sağlamıyor.");
            }
        }
    }

