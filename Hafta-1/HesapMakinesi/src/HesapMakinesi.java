import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int islem;
        double sayiBir, sayiIki;

        System.out.println("Lütfen ilk Sayıyı giriniz: ");
        sayiBir = girdi.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        sayiIki = girdi.nextDouble();

        do {
            System.out.println("Lütfen seçiniz: Toplama - 1 ; Çıkarma - 2 ; Bölme : 3 - Çarpma : 4");
            islem = girdi.nextInt();

            if (islem < 1 || islem > 4) {
                System.out.println("Geçersiz bir işlem seçtiniz. Lütfen 1 ile 4 arasında bir sayı giriniz.");
            }
        } while (islem < 1 || islem > 4);

        switch (islem) {
            case 1:
                System.out.println(sayiBir + sayiIki);
                break;
            case 2:
                System.out.println(sayiBir - sayiIki);
                break;
            case 3:
                if (sayiIki == 0) {
                    System.out.println("Lütfen sıfırdan farklı bir sayı giriniz");
                } else {
                    System.out.println(sayiBir / sayiIki);
                }
                break;
            case 4:
                System.out.println(sayiBir * sayiIki);
                break;
            default:
                break;
        }

        girdi.close();  // Close the Scanner outside the switch statement
    }
}
