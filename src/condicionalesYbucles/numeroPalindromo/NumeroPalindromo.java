package condicionalesYbucles.numeroPalindromo;

import java.util.Scanner;

public class NumeroPalindromo {
    public static void main(String[] args) {
        // 131
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es palindromo: ");
        int variable = scanner.nextInt();
        int reverso = 0;

        while (variable > 0){
           int residuo = variable % 10;
           reverso = reverso * 10 + residuo;
           variable /= 10;
        }

        if (reverso == variable){
            System.out.println("Si es un numero palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
    }

}
