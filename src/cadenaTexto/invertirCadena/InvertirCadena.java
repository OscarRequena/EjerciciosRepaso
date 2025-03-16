package cadenaTexto.invertirCadena;

public class InvertirCadena {
    public static void main(String[] args) {
        String cadena = "perro gato cuy";
        String inversa = "";

        for(int i = cadena.length() - 1 ; i >= 0; i--){
            inversa += cadena.charAt(i);
        }

        System.out.println(inversa);
    }
}
