//Nome:Mateus Moreira Fonseca -  RA: 1426885

import java.util.Scanner;

public class VetorInversoMateusMoreiraFonseca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }
        System.out.println("Valores do vetor em ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        input.close();
    }
}
