package fibonacci;

import java.util.Scanner;

/* @author Leandro */
public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            int n = scan.nextInt();

            if (isFibonacci(n)) {
                System.out.println(n + " pertence a sequencia de Fibonacci.");
            } else {
                System.out.println(n + " nao pertence a sequencia de Fibonacci.");
            }
        }
    }

    public static boolean isFibonacci(int num) {
        if (num < 0) return false;

        int a = 0, b = 1;
        
        if (num == a || num == b) return true;

        int fib = a + b;
        while (fib <= num) {
            if (fib == num) return true;
            a = b;
            b = fib;
            fib = a + b;
        }
        
        return false;
    }
}
