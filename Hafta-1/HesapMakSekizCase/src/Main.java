import java.util.Scanner;

public class Main {

    static int[] sayilariAl(int adet) {
        Scanner girdi = new Scanner(System.in);
        int[] sayilar = new int[adet];

        for (int i = 0; i < adet; i++) {
            System.out.println("Lütfen " + (i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = girdi.nextInt();
        }

        return sayilar;
    }

    static void sum(int a, int b) {
        System.out.println("Toplam: " + (a + b));
    }

    static void minus(int a, int b) {
        System.out.println("Çıkarma sonucu: " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("Çarpma sonucu: " + (a * b));
    }

    static double divide(Scanner girdi, double a, double b) {
        if (b != 0) {
            System.out.println("Bölme sonucu: " + (a / b));
            return a / b;
        } else {
            System.out.println("Bölen sıfırdan farklı olmalı, tekrar giriş yapınız");
            System.out.print("Birinci sayıyı giriniz: ");
            a = girdi.nextDouble();
            System.out.print("İkinci sayıyı giriniz: ");
            b = girdi.nextDouble();
            if (b != 0) {
                System.out.println("Yeni bölme sonucu: " + (a / b));
                return a / b;
            } else {
                System.out.println("Bölen hala sıfır, işlem gerçekleştirilemiyor.");
                return Double.NaN;
            }
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static void power(int a, int b) {
        double result = Math.pow(a, b);
        System.out.println(a + " üzeri " + b + " = " + result);
    }

    static void mod(int a, int b) {
        int modulus = a % b;
        System.out.println("MOD: " + modulus);
    }

    static void rectangleAreaPerimeter(double a, double b) {
        double area = a * b;
        double perimeter = 2 * (a + b);

        System.out.println("Dikdörtgen Alanı: " + area);
        System.out.println("Dikdörtgen Çevresi: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        char select = '0';

        String menu = "1- Toplama İşlemi " +
                "2- Çıkarma İşlemi " +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi " +
                "5- Üslü Sayı Hesaplama " +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alm " +
                "8- Dikdörtgen Alan ve Çevre Hesabı " +
                "0- Çıkış Yap";

        int[] sayilar = null;  // Başlangıçta null olarak başlatılıyor

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = girdi.next().charAt(0);

            switch (select) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '7':
                case '8':
                    //2 sayı al
                    sayilar = sayilariAl(2);
                break;

                case '6':
                    System.out.println("Lütfen sayiyi giriniz: ");
                    // Faktoriyel hesaplama için 1 sayı al
                    sayilar = sayilariAl(1);
                    break;
                case '0':
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    continue;  // Yanlış değer girildiyse döngüyü tekrar başlat
            }

            switch (select) {
                case '1':
                    sum(sayilar[0], sayilar[1]);
                    break;
                case '2':
                    minus(sayilar[0], sayilar[1]);
                    break;
                case '3':
                    multiply(sayilar[0], sayilar[1]);
                    break;
                case '4':
                    divide(girdi, sayilar[0], sayilar[1]);
                    break;
                case '5':
                    power(sayilar[0], sayilar[1]);
                    break;
                case '6':
                    int faktoriyelSonucu = factorial(sayilar[0]);
                    System.out.println(sayilar[0] + " sayısının faktöriyeli: " + faktoriyelSonucu);
                    break;
                case '7':
                    mod(sayilar[0], sayilar[1]);
                    break;
                case '8':
                    rectangleAreaPerimeter(sayilar[0], sayilar[1]);
                    break;
                case '0':
                    break;
            }

        } while (select != '0');
    }
}
