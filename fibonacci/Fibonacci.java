package fibonacci;

import java.util.Scanner;

/* @author Leandro */
public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            int n = scan.nextInt();

            long result = fibonacci(n);

            System.out.println("Fibonacci de " + n + " eh: " + result);
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib[n];
    }
}
