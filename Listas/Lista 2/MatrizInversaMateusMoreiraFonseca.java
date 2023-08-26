//Nome:Mateus Moreira Fonseca -  RA: 1426885

import java.util.Scanner;

public class MatrizInversaMateusMoreiraFonseca {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz:");
int linhas = input.nextInt();

System.out.println("Digite o número de colunas da matriz:");
int colunas = input.nextInt();

int[][] matriz = new int[linhas][colunas];

System.out.println("Digite os valores da matriz:");
for (int i = 0; i < linhas; i++) {
    for (int j = 0; j < colunas; j++) {
        matriz[i][j] = input.nextInt();
    }
}
System.out.println("Valores da matriz em ordem inversa:");
for (int i = linhas - 1; i >= 0; i--) {
    for (int j = colunas - 1; j >= 0; j--) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

input.close();
}}
