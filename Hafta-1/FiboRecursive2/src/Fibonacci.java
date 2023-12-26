import java.util.Scanner;

public class Fibonacci {

    // Recursive metot Fibonacci hesaplamak için kullanılır
    public static int fibonacci(int n) {
        // Eğer n 0 veya 1 ise, n'yi direkt olarak döndür
        if (n <= 1) {
            return n;
        } else {
            // n'in önceki iki Fibonacci sayısının toplamı olduğunu unutma
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için terim sayısını girin: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci serisi (ilk " + n + " terim):");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
