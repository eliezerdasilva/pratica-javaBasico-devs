package ExercicioList;

import java.util.Scanner;

/*
2. Crie um array com 3 strings e exiba a primeira letra da segunda string.
 */
public class Exercicio02Array {

    public static void main(String[] args) {
        //Como o exercício pede para ir até 3 palavras, como zero inicio o vetor delimitei como 2
        String[] array = {"String1","String2","String3"};


        System.out.println("A primeira letra da seguda palavra é : "+array[1].charAt(0));
    }
}
