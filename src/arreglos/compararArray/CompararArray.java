package arreglos.compararArray;

import java.util.Arrays;

public class CompararArray {
    public static void main(String[] args) {

        Object[] array1 = {1,2,3};
        Object[] array2 = {1,2,3};
        Object[] array3= {2,3,4};

        if (Arrays.equals(array1, array2)){
            System.out.println("son iguales");
        } else{
            System.out.println("no son iguales");
        }
    }
}
