package condicionalesYbucles.numeroPar;

import java.util.Scanner;

public class numeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es Par: ");
        int par = scanner.nextInt();

        if (par % 2 == 0){
            System.out.println("el numero es Par");
        } else {
            System.out.println("el numero no es Par");
        }

    }
}
