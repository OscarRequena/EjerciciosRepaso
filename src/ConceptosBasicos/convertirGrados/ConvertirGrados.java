package ConceptosBasicos.convertirGrados;

public class ConvertirGrados {

    public static void main(String[] args) {
        float celcius = 2;

        convertirGrados(celcius);

    }

    public static void convertirGrados(float celcius){

        float resultado = (celcius * 9/5) + 32;

        System.out.println("el resultado de la operación es: " + resultado);
    }
}
