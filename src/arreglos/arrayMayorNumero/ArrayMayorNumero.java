package arreglos.arrayMayorNumero;

public class ArrayMayorNumero {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

        int mayor = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > mayor){
                mayor = array[i];
            }
        }
        System.out.println(mayor);
    }
}
