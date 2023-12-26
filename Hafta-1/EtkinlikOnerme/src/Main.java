import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int girilenDeger;

        System.out.print("Bir tam sayı girin: ");
        girilenDeger = girdi.nextInt();

            // burada her bir koşulu kontrol ediyoruz
            if (girilenDeger < 5) {
                System.out.println("Kayak ");
            }

            if (girilenDeger >= 5 && girilenDeger <= 15) {
                System.out.println("Sinema");
            }

            if (girilenDeger >= 10 && girilenDeger <= 25) {
                System.out.println("Piknik");
            }

            // Hiç bir koşulu sağlamamasını kontrol ediyoruz
            if (girilenDeger > 25 ) {
                System.out.println("Piknik miknik yok! Şap! Şap! Şap! (Yüzme)");
            }
        }
    }

