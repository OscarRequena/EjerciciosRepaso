package condicionalesYbucles.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 12
        int primerNumero = 0;
        int segundoNumero = 1;
        for (int i = 0; i < 10 ;i++){
            System.out.println(primerNumero);
            int suma = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = suma;
        }
    }
}
