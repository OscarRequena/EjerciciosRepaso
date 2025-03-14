package arreglos.numerosParesArray;

public class NumerosParesArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] par = new int[array.length];
        for (int i = 0; i < array.length; i++){
            if ( (array[i] % 2) == 0 )
                par[i] = array[i];
        }

        for (int xxx: par){
            System.out.print(xxx + " ");
        }
    }
}
