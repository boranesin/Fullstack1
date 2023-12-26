public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt();
        input.close();

        printNumbers(n);
    }

    public static void printNumbers(int n) {
        // Temel durum: n 0 veya negatifse, işlemi sonlandır ve geri dön
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        // İleriye doğru işlem: n'den 5 çıkar ve sonucu ekrana yazdır
        System.out.print(n + " ");
        printNumbers(n - 5);

        // Geriye doğru işlem: n'e 5 ekleyerek sonucu ekrana yazdır
        System.out.print(n + " ");
    }
}
