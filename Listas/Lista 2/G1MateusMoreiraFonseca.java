//Nome:Mateus Moreira Fonseca -  RA: 1426885
import java.util.Scanner;

public class G1MateusMoreiraFonseca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double num1, num2;
        String operacao;

        if (args.length == 1) {
            System.out.println("Calculadora " + args[0]);
            return;
        } else if (args.length == 3) {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
            operacao = args[2];
        } else {
            System.out.println("Calculadora básica:");
            System.out.println("Digite o 1° número:");
            num1 = entrada.nextDouble();

            System.out.println("Digite o 2° número:");
            num2 = entrada.nextDouble();

            System.out.println("Digite a operação desejada (+, -, * ou /):");
            operacao = entrada.next();
        }

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.printf("Resultado: %.2f", resultado);

        entrada.close();
    }
}
