package cadenaTexto.palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String variable = sc.nextLine();

        String inversa = "";

        for(int i = variable.length() - 1 ; i >= 0; i--){
            inversa += variable.charAt(i);
        }

        if (variable.equals(inversa)){
            System.out.println("es un palindromo");
        } else {
            System.out.println("no lo es");
        }


    }
}
