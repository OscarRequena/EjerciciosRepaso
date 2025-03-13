package condicionalesYbucles.tablaMultiplicacion;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero que deseas ver la tabla de multiplicacion: ");
        int variable = scanner.nextInt();

        tablaMultiplicacion(variable);
    }

    private static void tablaMultiplicacion(int variable) {

        System.out.println("tabla de multiplicacion de "+variable);
        for(int i = 0; i < 13; i++){
            int multiplicar = i * variable;
            System.out.println(i + " "+ "X " + variable + " = "+ multiplicar );
        }

    }
}
