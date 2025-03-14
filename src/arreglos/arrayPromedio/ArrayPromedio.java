package arreglos.arrayPromedio;

public class ArrayPromedio {
    public static void main(String[] args) {
        int[] array = {5,5,5};
        int promedio;
        int suma = 0;
        for (int i = 0; i < array.length ; i++){
            suma += array[i];
        }

        promedio = suma / array.length;

        System.out.println(promedio);
    }
}