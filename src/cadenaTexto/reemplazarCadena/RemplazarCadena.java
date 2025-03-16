package cadenaTexto.reemplazarCadena;

public class RemplazarCadena {
    public static void main(String[] args) {
        String cadena = "ccncncnjjaaeeee";
        char[] vocales = {'a','e','i','o','u'};
        String nueva = "";

        for (int i = 0 ; i < cadena.length() - 1 ; i++){
            char variable = cadena.charAt(i);
            for (int j = 0; j < vocales.length -1 ; j++){
                if ( variable == vocales[j] ){
                    variable = '*';
                }
            }
            nueva += variable;
        }
        System.out.println(nueva);
    }
}