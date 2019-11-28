public class Fibonacci {


    public static long fibonacci_plain(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Only positive numbers");
        } else if (n <= 1) {
            return n;
        }
        int fibo = 1;
        int fiboPrev = 1;
        for(int i = 2; i < n; i++) {
            int temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;
        }
        return fibo;
    }


    public static long fibonacci_recursive(long n) {
        if(n < 0) {
            throw new IllegalArgumentException("Only positive numbers");
        } else if (n <= 1) {
            return n;
        } else {
            return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        }
    }


    public static long fibArray[] = new long[100];

    public static long fibonacci_memoization(long n){
        if(n < 0) {
            throw new IllegalArgumentException("Only positive numbers");
        } else if(n <= 1) {
            return n;
        } else if(fibArray[(int) n] != 0) {
            return fibArray[(int)n];
        } else {
            long fibValue = fibonacci_memoization(n-1) + fibonacci_memoization(n-2);
            fibArray[(int) n] = fibValue;
            return fibValue;
        }
    }
}
