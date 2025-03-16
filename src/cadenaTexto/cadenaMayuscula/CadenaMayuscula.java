package cadenaTexto.cadenaMayuscula;

import java.util.ArrayList;

public class CadenaMayuscula {
    public static void main(String[] args) {
        convertirMayuscula();
    }

    private static void convertirMayuscula() {
        String cadena = "la casa de pinocho";
        ArrayList<String> array= new ArrayList<>();
        String nuevaCadena = "";

        for (int i = 0; i < cadena.length(); i++){
            char charPorChar = cadena.charAt(i);
            nuevaCadena += mayuscula(charPorChar);
        }
        array.add(nuevaCadena);
        System.out.println(array);
    }

    private static char mayuscula(char cadena){
        if (cadena >= 'a' && cadena <= 'z' ){
            return (char) (cadena - 32);
        }else{
            return cadena;
        }
    }

}
