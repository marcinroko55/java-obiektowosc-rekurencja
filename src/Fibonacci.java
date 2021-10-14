public class Fibonacci {
    int obliczanieCiaguFibonacciego(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return obliczanieCiaguFibonacciego(n - 1) + obliczanieCiaguFibonacciego(n - 2);
    }

    static int obliczanieCiaguFibonacciegoStatyczna(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return obliczanieCiaguFibonacciegoStatyczna(n - 1) + obliczanieCiaguFibonacciegoStatyczna(n - 2);
    }
}