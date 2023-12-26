import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç eleman içersin? ");
        int elemanSayisi = girdi.nextInt();

        System.out.println("Fibonacci Serisi:");
        int fib1 = 0, fib2 = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fib1 + " ");
            //burada üç işlem ile fibonnaci örgüsünü tanımladık
            int toplam = fib1 + fib2;
            fib1 = fib2;
            fib2 = toplam;
        }

        girdi.close();
    }
}
