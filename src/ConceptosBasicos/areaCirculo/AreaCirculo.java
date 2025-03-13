package ConceptosBasicos.areaCirculo;

public class AreaCirculo {

    public static void main(String[] args) {

        double radio = 2;

        areaCirculo(radio);
        circuferencia(radio);

    }

    public static void areaCirculo(double radio){
        double resultado = Math.PI * Math.pow(radio,2);
        System.out.println("el area del circulo es: " + resultado);
    }

    public static void circuferencia(double radio){
        double resultado = 2 * Math.PI * radio;
        System.out.println("la circuferencia es: " + resultado);
    }

}
