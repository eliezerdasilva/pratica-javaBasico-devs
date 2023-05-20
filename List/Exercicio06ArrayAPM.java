package ExercicioList;

import java.util.Scanner;

/*
1. Crie um programa que receba do usuário 5 números inteiros e armazene-os em um
array. Em seguida, o programa deve exibir o maior número informado pelo usuário.
 */
public class Exercicio06ArrayAPM{
    public static void main(String[] args) {
        System.out.println("Informe 5 números");
        int array[]= new int[5];
        var ler = new Scanner(System.in);
        for(int i = 0; i<array.length;i++){
            System.out.println("Informe o "+(i+1)+" números");
            array[i]= ler.nextInt();
        }
        int maior = array[0];
        for(int j = 0; j<array.length;j++){
           if(array[j]>maior){
               maior= array[j];
           }
        }
        System.out.println("O maior número é : "+maior);
    }
}
