import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazıyoruz
        Scanner girdi = new Scanner(System.in);
        int a, b, c;

        // sayilari kullanicidan aliyoruz
        System.out.println("Lutfen ilk sayiyi giriniz: ");
        a = girdi.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        b = girdi.nextInt();
        System.out.println("Lutfen ucuncu sayiyi giriniz: ");
        c = girdi.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if ((c < a) && (c < b)) {
            if (b < a) {
                System.out.println("c< b < a");
            } else {
                System.out.println("c < a < b");
            }
        }
    }
}