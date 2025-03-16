package cadenaTexto.concatenar;

import java.util.ArrayList;

public class Concatenar {
    public static void main(String[] args) {
        concatenar();
    }
    private static void concatenar() {
        String cadena1 = "hola ";
        String cadena2 = "quiero bd";
        String suma = "";
        char caracteres ;
        ArrayList<String> nuevaCadena = new ArrayList<>();

        for (int i = 0; i < cadena1.length() ;i++){
            caracteres = cadena1.charAt(i) ;
            suma += caracteres;
        }
        for (int j = 0; j < cadena2.length() ; j++){
            caracteres = cadena2.charAt(j);
            suma += caracteres;
        }
        nuevaCadena.add(suma);
        System.out.println(nuevaCadena);
    }
}