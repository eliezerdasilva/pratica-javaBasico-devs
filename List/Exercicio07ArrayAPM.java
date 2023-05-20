package ExercicioList;

import java.util.Scanner;

/*
2. Crie um programa que receba do usuário um texto e armazene-o em um array de
caracteres. O programa deve exibir a quantidade de vogais presentes no texto
informado.
 */
public class Exercicio07ArrayAPM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        //Transforma a frase em caracteres
        char[] caract = texto.toCharArray();

        int contador = 0;

        for (char c : caract) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }

        System.out.println("A quantidade de vogais presentes no texto é : " + contador );


    }
}
