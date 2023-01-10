public class VersaoAtualizadaImpostoDeRenda {
    public static void main(String[] args) {

            double salario = 2350;
            double v = 4664.68;
            if ( salario <= 903.98 ) {
                System.out.println("Isento");
            } else if ( salario >= 1903.99 && salario <= 2826.26 ) {
                System.out.println("O valor a ser pago será de 7.5% " + (salario * 0.075));
            } else if ( salario >= 2826.27 && salario <= 3751.05) {
                System.out.println(" O valor a ser pago será de 15% " + (salario * 0.15));
            } else if (salario >= 3751.06 && salario <= 4664.68){
                System.out.println("O valor a ser pago será de 22.5% " + (salario * 0.225));
            } else {
                System.out.println("O valor a ser pago será de 27.5% " + (salario * 0.275));

            }

        }

    }
