package cadenaTexto.conteoVocales;

public class ConteoVocales {
    public static void main(String[] args) {
        String[] cadena = {"ccncncnjjaa"};
        char[] vocales = {'a','e','i','o','u'};

        int cont = 0;
        for (int i = 0 ; i < cadena.length; i++){
            if ((char)cadena[i] >= vocales[i] ){
                cont++;
            }
        }
    }
}
