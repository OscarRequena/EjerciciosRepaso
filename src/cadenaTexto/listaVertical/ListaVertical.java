package cadenaTexto.listaVertical;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaVertical {

    public static void main(String[] args) {

        listar();
    }

    private static void listar() {
        Scanner sc = new Scanner(System.in);
        String  oracionCompleta = sc.nextLine();
        ArrayList<String> pepe = new ArrayList<>();
        String palabra = "";
        for (int i = 0 ; i < oracionCompleta.length() ; i++){
           char variable = oracionCompleta.charAt(i);
            if (variable != ' '){
                palabra += variable;
            }else if(!palabra.isEmpty()){
                pepe.add(palabra);
                palabra = "";
            }
        }
        if (!palabra.isEmpty()){
            pepe.add(palabra);
        }
        System.out.println(pepe);
    }
}