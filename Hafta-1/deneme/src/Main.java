public class Main {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Faktöriyel: " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {  // Base case
            return 1;
        } else {
            System.out.println();
            return n * factorial(n - 1);  // Recursive call
        }
    }
}
