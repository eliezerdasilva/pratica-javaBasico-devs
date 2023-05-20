package ExercicioList;

import java.util.Scanner;

/*
5. Crie um programa que receba do usuário um array com N números reais e encontre
o segundo maior valor presente no array.
 */
public class Exercicio10ArrayAPM {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = ler.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os " + n + " elementos do array reais :");
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }

        double maior = Double.NEGATIVE_INFINITY;
        double segundoMaior = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            if (array[i] > maior) {
                segundoMaior = maior;
                maior = array[i];
            } else if (array[i] > segundoMaior && array[i] < maior) {
                segundoMaior = array[i];
            }
        }


            System.out.println("O segundo maior valor do  array é: " + segundoMaior);



    }
}
