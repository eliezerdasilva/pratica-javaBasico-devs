package lacosDeRepeticao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 4. Escreva um programa que leia uma sequência de palavras informadas pelo usuário
e conte quantas vezes cada palavra aparece na sequência. Depois, imprima a lista
de palavras e suas respectivas contagens.
 */
public class Atividade09LR {

	public static void main(String[] args) {
		
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite uma sequência de palavras:");
	        String[] palavras = scanner.nextLine().split
	        		(" ");

	        Map<String, Integer> frequencias = new HashMap<>();
	        for (String palavra : palavras) {
	            if (frequencias.containsKey(palavra)) {
	                frequencias.put(palavra, frequencias.get(palavra) + 1);
	            } else {
	                frequencias.put(palavra, 1);
	            }
	        }

	        System.out.println("Palavras e suas contagens:");
	        for (Map.Entry<String, Integer> entrada : frequencias.entrySet()) {
	            System.out.println(entrada.getKey() + ": " + entrada.getValue());
	        }
		}
		

	}

}
