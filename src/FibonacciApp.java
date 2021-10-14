import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        long ciag = 0;
        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            ciag = a + b;
            a = b;
            b = ciag;
            System.out.println(ciag);
        }
        Fibonacci.obliczanieCiaguFibonacciegoStatyczna(n);
    }
}



