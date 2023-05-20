package ExercicioList;

import java.util.Scanner;

/*
4. Crie um programa que receba do usuário um array com N números inteiros e um
número M. O programa deve exibir a quantidade de elementos do array que são
maiores que M.
 */
public class Exercicio09ArrayAPM {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = ler.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os " + n + " elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }

        System.out.print("Digite o valor de M a ser comparado: ");
        int m = ler.nextInt();

        int Maiores = 0;

        //Verifica se o número informado no array é maior do o número a ser comparado
        for (int i = 0; i < n; i++) {
            if (array[i] > m) {
                Maiores++;
            }
        }

        System.out.println("A quantidade de elementos do  vetor, que são maiores que "+m+" são : " + Maiores);
    }
}
