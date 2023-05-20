package lacosDeRepeticao;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * 2. Escreva um programa que lê uma sequência de números informados pelo usuário e
mostra quantos números estão acima da média e quantos estão abaixo da média.
 */
public class Atividade07LR {

	public static void main(String[] args) {
	

				Scanner ler = new Scanner(System.in);
		       
				//Invés de pedir para o usuário informar uma caracter, pedi para informar a quantidade de números que serão digitados
		        System.out.print("Digite a quantidade de números a serem informados: ");
		        int n = ler.nextInt();

		        int[] numeros = new int[n];
		        
		      
		        //Informando os números
		        for (int i = 0; i < n; i++) {
		        	System.out.println("Digite o números:"+i);
		            numeros[i] = ler.nextInt();
		        }

	
		        double soma = 0;
		        for (int i = 0; i < n; i++) {
		            soma += numeros[i];
		        }
		        double media = soma / n;

		      
		        int acaMedia = 0;
		        int abMedia = 0;

		        for (int i = 0; i < n; i++) {
		            if (numeros[i] > media) {
		            	acaMedia++;
		            } else if (numeros[i] < media) {
		            	abMedia++;
		            }
		        }

		        // Exibir o resultado pedido no exercício
		        System.out.println("Média: " + media);
		        System.out.println("Quantidade de números acima da média: " + acaMedia);
		        System.out.println("Quantidade de números abaixo da média: " + abMedia);
		    }
		


	

}
