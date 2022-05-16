import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);
        Double numero1 = leitor.nextDouble();
        Double numero2 = leitor.nextDouble();
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(numero1+numero2);
                break;
            case 2:
                System.out.println(numero1-numero2);
                break;
            case 3:
                System.out.println(numero1*numero2);
                break;
            case 4:
                System.out.println(numero1/numero2);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}
