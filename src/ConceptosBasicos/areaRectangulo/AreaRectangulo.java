package ConceptosBasicos.areaRectangulo;

public class AreaRectangulo {

    public static void main(String[] args) {
       int largo = 12;
       int ancho = 2;
       areaRectangulo(largo,ancho);
    }

    public static void areaRectangulo(int largo, int ancho){
        int area = largo * ancho ;
        System.out.println("el area del rectangulo es: " + area);
    }
}
