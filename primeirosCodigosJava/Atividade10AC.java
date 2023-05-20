package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que leia uma string e verifique se ela é um palíndromo, ou seja, se a string lida é a mesma lida de trás para frente.
 */
public class Atividade10AC {

	public static void main(String[] args) {
		
		String fraseString = JOptionPane.showInputDialog("Digite uma palavra ou frase: ");
      
        int inicio = 0;
        int fim = fraseString.length() - 1;
        boolean palindromo = true;

        while (fim > inicio) {
            if (fraseString.charAt(inicio) != fraseString.charAt(fim)) {
                palindromo = false;
                break;
            }
            inicio++;
            fim--;
        }

        if (palindromo) {
        	JOptionPane.showMessageDialog(null,"A palavra/frase"+fraseString+" digitada é um palíndromo.");
        } else {
        	JOptionPane.showMessageDialog(null,"A palavra/frase digitada não é um palíndromo.");
        }	

	}

}
