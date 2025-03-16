package cadenaTexto.eliminaEspacioBlanco;

import java.util.ArrayList;

public class EliminaEspacioBlanco {
    public static void main(String[] args) {
        eliminaEspacioBlanco();
    }

    private static void eliminaEspacioBlanco() {
        String cadena = "la casa de pinocho";
        String nuevaCadena = "";
        ArrayList<String> eliminarEspacioEnBlanco = new ArrayList<>();

        for (int i = 0 ; i < cadena.length() ; i++){
            char variable = cadena.charAt(i);
            if (variable != ' '){
                nuevaCadena += variable;
            }
        }
        eliminarEspacioEnBlanco.add(nuevaCadena);
        System.out.println(eliminarEspacioEnBlanco);
    }
}
