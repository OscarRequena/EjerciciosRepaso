package ConceptosBasicos.parOinpar;

public class ParOInpar {
    public static void main(String[] args) {
        int variable1 = 2;
        int variable2 = 3;

        parOInpar(variable1);

    }

    private static void parOInpar(int variable) {
        if ( (variable % 2) == 0){
            System.out.println("el numero es Par");
        } else {
            System.out.println("el numero es InPar");
        }

    }

}
