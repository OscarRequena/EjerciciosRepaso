package cadenaTexto.conteoPalabra;

import java.util.ArrayList;
import java.util.Scanner;

public class ConteoPalabra {

    public static void main(String[] args) {
        conteoPalabra();
    }

    private static void conteoPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("jejejejjeej: ");
        String  oracionCompleta = sc.nextLine();

        ArrayList<String> pepe = new ArrayList<>();
        String palabra = "";
        int conteo = 0;
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

        conteo = pepe.size();
        System.out.println(conteo);
    }
}