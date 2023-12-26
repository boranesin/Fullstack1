import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımladık
    double kilo;
    double boy;
    double vki;
    Scanner girdi = new Scanner(System.in);
    //boy ve kilo değerlerin alıyoruz.
    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
    boy = girdi.nextDouble();
    System.out.println("Lütfen kilonuzu giriniz: ");
    kilo = girdi.nextDouble();

    vki = kilo / (boy*boy);
    System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : " + boy);
    System.out.println("Lütfen kilonuzu giriniz: " + kilo);
    System.out.println("Vücut kitle indeksiniz= " + vki);
    }
    }