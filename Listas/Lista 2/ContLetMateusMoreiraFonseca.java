//Nome:Mateus Moreira Fonseca -  RA: 1426885
import java.util.Scanner;

public class ContLetMateusMoreiraFonseca {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite uma frase:");
        String frase = input.nextLine();
        System.out.println("Digite uma letra:");

        String letra = input.nextLine().toLowerCase();

        int ocorrencias = 0;
        int posicao = -1;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == letra.charAt(0)) {
                ocorrencias++;
                if (posicao == -1) {
                    posicao = i;
                }
            }
        }
        if (ocorrencias > 0) {
            System.out.println("A letra '" + letra + "' apareceu " + ocorrencias + " vezes na frase.");
            System.out.println("A primeira ocorrência está na posição " + posicao + ".");
        } else {
            System.out.println("A letra '" + letra + "' não existe na frase.");
        }

        input.close();
    }
}
