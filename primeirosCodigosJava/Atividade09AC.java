package primeirosCodigosJava;

/*
 * Escreva um programa que leia três números inteiros e verifique se eles formam uma sequência aritmética. Caso afirmativo, exiba a razão da sequência.
 */

import javax.swing.JOptionPane;

public class Atividade09AC {

	public static Atividade09AC atividade09ac;
	public static void main(String[] args) {
		
		String numeroString1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro: ");
      
		String numeroString2 = JOptionPane.showInputDialog("Digite o segundo número inteiro: ");
      
		String numeroString3 = JOptionPane.showInputDialog("Digite o terceiro número inteiro: ");
		atividade09ac = new Atividade09AC();
		try {
			Integer num1 = Integer.valueOf(numeroString1);
			Integer num2 = Integer.valueOf(numeroString2);
			Integer num3 = Integer.valueOf(numeroString3);
			atividade09ac.numerosPrimos(num1,num2,num3);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Informes apenas números inteiros","Erro",JOptionPane.ERROR_MESSAGE);
		}
	}
	//Método que verifica se a sequência é aritmétrica
	public void numerosPrimos(Integer num1, Integer num2, Integer num3) {
		if ((num2 - num1) == (num3 - num2)) {
            int sequencia = num2 - num1;
            JOptionPane.showMessageDialog(null,"Os números formam uma sequência aritmética com razão " + sequencia + ".");
        } else {
        	JOptionPane.showMessageDialog(null,"Os números não formam uma sequência aritmética.");
        }
	}

}
