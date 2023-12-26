import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //class ve değişkenleri tanımladık
        int a, b, c;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Lütfen birinci kerar uzunluğunu giriniz: ");
        a = girdi.nextInt();

        System.out.println("Lütfen ikinci kerar uzunluğunu giriniz: ");
        b = girdi.nextInt();

        System.out.println("Lütfen son kerar uzunluğunu giriniz: ");
        c = girdi.nextInt();

        int cevre = (a + b + c) ;

        double u = (cevre / 2);

        double Alan = Math.sqrt( u * ( u -a ) * (u - b) * (u -c ));

        System.out.println(Alan);
    }
}