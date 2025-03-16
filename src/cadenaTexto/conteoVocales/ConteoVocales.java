package cadenaTexto.conteoVocales;

public class ConteoVocales {
    public static void main(String[] args) {
        String cadena = "ccncncnjjaaeeee";
        char[] vocales = {'a','e','i','o','u'};

        int cont = 0;
        for (int i = 0 ; i < cadena.length(); i++){
            char variable = cadena.charAt(i);

            for (int j = 0; j < vocales.length - 1; j++){
                if (variable == vocales[j]){
                    cont++;
                }
            }
        }
        System.out.println(cont);
    }
}
