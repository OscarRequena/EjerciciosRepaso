package ConceptosBasicos.promedio;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 3; i++){
            System.out.println("ingrese el primer numero: ");
            double variable1 = scanner.nextDouble();

            System.out.println("ingrese el segundo numero: ");
            double variable2 = scanner.nextDouble();

            System.out.println("ingrese el tercero numero: ");
            double variable3 = scanner.nextDouble();

            double[] variables = new double[3];
            variables[0] = variable1;
            variables[1] = variable2;
            variables[2] = variable3;

            promedio(variables);

        }
    }

    private static void promedio(double[] variables) {
        double resultado = (variables[0] + variables[1] + variables[2])/3;
        System.out.println(" el promedio de los tres números son: " +resultado);
    }


}
