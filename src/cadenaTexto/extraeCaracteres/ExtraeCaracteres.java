package cadenaTexto.extraeCaracteres;

import java.util.ArrayList;

public class ExtraeCaracteres {
    public static void main(String[] args) {
        extraerCaracteres();
    }

    private static void extraerCaracteres() {
        String cadena = "lacasade pinocho";
        ArrayList<String> extraer = new ArrayList<>();
        String nueva = "";

        for (int i = 0; i < cadena.length(); i++){
            char variable = cadena.charAt(i);
            if ( i >= 0 && i <= 4 ){
                //extraer.add(variable);
                nueva += variable;
            }
        }
        extraer.add(nueva);
        System.out.println(extraer);
    }
}
