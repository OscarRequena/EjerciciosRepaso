package condicionalesYbucles.factorialNumero;

import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escriba un numero para calcular su factorial: ");
        int variable = scanner.nextInt();
        int resultado = 1;
        for ( int i= 1; i < variable+1;i++ ){
            resultado = i * resultado;
        }
        System.out.println(resultado);
    }
}
