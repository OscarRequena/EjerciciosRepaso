package condicionalesYbucles.conteoDigito;

import java.util.Scanner;

public class conteoDigito {
    public static void main(String[] args) {
        System.out.println("Ingrese ");
        Scanner scanner = new Scanner(System.in);
        int variable = scanner.nextInt();
        int cont = 0;
        while(variable > 0){
            variable /=10;
            cont++;
        }
        System.out.println(cont);
    }
}
