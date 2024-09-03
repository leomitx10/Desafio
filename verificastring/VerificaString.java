package verificastring;

import java.util.Scanner;

/* @author Leandro*/
public class VerificaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String entrada = scanner.nextLine();
              
        int c = 0;
        
        for (char ch : entrada.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                c++;
            }
        }
        
        System.out.println(c > 0 ? "A letra 'a' ocorre " + c + " vezes na string."
                                 : "A letra 'a' nao foi encontrada na string.");
    }
}

