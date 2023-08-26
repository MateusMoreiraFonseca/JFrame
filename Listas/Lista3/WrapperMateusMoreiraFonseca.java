//Nome:Mateus Moreira Fonseca -  RA: 1426885

import java.util.Scanner;

public class WrapperMateusMoreiraFonseca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("Selecione uma das classes abaixo:");
            System.out.println("1. Integer");
            System.out.println("2. Boolean");
            System.out.println("3. Character");
            System.out.println("4. Double");
            System.out.println("5. Byte");
            System.out.println("6. Short");
            System.out.println("7. Float");
            System.out.println("8. Long");
            System.out.println("0. Sair");

                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        // i) Classe Integer: método toString()
                        // ii) O método toString irá converter um valor inteiro para uma String.
                        // iii)Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#toString-int-

                        System.out.print("Digite um valor inteiro a ser convertido para String: ");
                        int intValue2 = scanner.nextInt();
                        String strValue2 = Integer.toString(intValue2);
                        System.out.println("Valor convertido de int para String: " + strValue2);

                        break;

                    case 2:
                        // i) Classe Boolean: método valueOf()
                        // ii) O método valueOf irá retornar um objeto Boolean representando o valor booleano passado como parâmetro.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html#valueOf-boolean-

                        System.out.print("Digite um valor inteiro (0 ou 1): ");
                        int intValue = scanner.nextInt();
                        boolean boolValue = intValue == 1;
                        Boolean boolObj = Boolean.valueOf(intValue == 1);
                        System.out.println("Valor booleano correspondente: " + boolValue);
                        System.out.println("Objeto Boolean correspondente: " + boolObj);

                        break;

                    case 3:
                        // i) Classe Character: método isDigit()
                        // ii) O método isDigit irá verificar se o caractere informado é um dígito numérico.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-

                        System.out.print("Digite um caractere: ");
                        char charValue = scanner.next().charAt(0);
                        boolean isDigit = Character.isDigit(charValue);
                        System.out.println("O caractere " + charValue + " é um dígito? " + isDigit);

                        break;

                    case 4:
                        // i) Classe Double: método valueOf() e método doubleValue()
                        // ii) O método valueOf() converte um valor primitivo do tipo double para um objeto do tipo Double.Já o método 
                        // doubleValue() converte um objeto do tipo Double para um valor primitivo do tipo double.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#valueOf-double-

                        System.out.print("Digite um valor de ponto flutuante: ");
                        double doubleValue = scanner.nextDouble();
                        double primitiveValue = Double.valueOf(doubleValue).doubleValue();
                        System.out.println("Valor primitivo: " + primitiveValue);
                        break;
                    case 5:
                        // i) Classe Byte: método parseByte()
                        // ii) O método parseByte irá converter uma String em um valor do tipo primitivo byte.
                        // iii) Referência:https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Byte.html#parseByte(java.lang.String)

                        System.out.print("Digite uma string: ");
                        String str = scanner.nextLine();
                        try {
                            byte b = Byte.parseByte(str);
                            System.out.println("Valor convertido: " + b);
                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "A string " + str + " não representa um valor numérico do tipo byte válido");
                        }
                        break;
                    case 6:

                        // i) Classe Short: método toString()
                        // ii) O método toString irá converter um valor do tipo short para uma String.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html#toString-short-

                        System.out.print("Digite um valor do tipo short: ");
                        short shortValue = scanner.nextShort();
                        String shortStrValue = Short.toString(shortValue);
                        System.out.println("Valor short: " + shortValue);
                        System.out.println("Valor em String: " + shortStrValue);
                        break;
                    case 7:
                        // i) Classe Float: métodos nextFloat()
                        // ii) O código irá ler dois valores de ponto flutuante do usuário e compará-los para determinar qual é o maior, 
                        // menor ou se são iguais.
                        // iii) Referência: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#nextFloat--
                        System.out.print("Digite um valor de ponto flutuante com no mínimo 3 dígitos após a vírgula: ");
                        float floatValue2 = scanner.nextFloat();

                        System.out.print(
                                "Digite outro valor de ponto flutuante com no mínimo 3 dígitos após a vírgula: ");
                        float floatValue3 = scanner.nextFloat();

                        String comparacao = floatValue2 > floatValue3 ? "maior"
                                : floatValue2 < floatValue3 ? "menor" : "igual";

                        System.out.println("O primeiro número é " + comparacao+ " que o segundo.");

                        break;
                    case 8:
                        // i) Classe String: método format()
                        // ii) O método format permite formatar uma string com base em um valor numérico
                        // e outros parâmetros especificados.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#format-java.lang.String-java.lang.Object...-

                        // i) Classe Long: método parseLong()
                        // ii) O método parseLong irá converter uma string para um valor do tipo long.
                        // iii) Referência:https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html#parseLong-java.lang.String-
                        System.out.print("Digite um número long com no mínimo 10 dígitos: ");
                        long longValue = scanner.nextLong();

                        String longStrValue = String.format("%010d", longValue);

                        System.out.println("Valor em long: " + longValue);
                        System.out.println("Valor em String : " + longStrValue);

                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        

        scanner.close();
    }

}
