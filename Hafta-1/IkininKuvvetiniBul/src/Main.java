import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı giriniz: ");
        n = girdi.nextInt();

        for (int i = 1; i <=n; i*=2 ) {
            System.out.println(i);
        }
    }
}