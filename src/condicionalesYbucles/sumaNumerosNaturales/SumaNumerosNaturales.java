package condicionalesYbucles.sumaNumerosNaturales;

public class SumaNumerosNaturales {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 101; i ++){
            suma += i;
        }
        System.out.println("la suma de los 100 numeros naturales son :" +suma);
    }

}
