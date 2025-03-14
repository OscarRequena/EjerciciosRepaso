package arreglos.arrayMenorNumero;

public class ArrayMenorNumero {

    public static void main(String[] args) {

        int[] array = {8,6,3,4,5,1,5};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
