package condicionalesYbucles.tipoNumero;

import java.util.Scanner;

public class tipoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero para determinar si es positivo, negativo o un 0 ");
        int variable = scanner.nextInt();

        if ( variable > 0 ){
            System.out.println("el numero es positivo");
        } else if (variable < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es 0");
        }

    }
}
