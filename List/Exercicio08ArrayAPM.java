package ExercicioList;

import java.util.Scanner;

/*
3. Crie um programa que receba do usuário um número inteiro N e um array com N
elementos. O programa deve ordenar os elementos do array em ordem crescente e
exibi-los na tela.
 */
public class Exercicio08ArrayAPM {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a o tamanho  do array: ");
        int n = ler.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os  elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }


        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int temp = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = temp;
            }
        }
        System.out.println("A ordem  crescente é:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] +",");
        }
        System.out.println();


    }
}
