package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que verifique se um número é par ou ímpar utilizando o operador módulo.
 */
public class Atividade02 {
	
	public static Atividade02 atividade02; 

	
	public static void main(String[] args) {
		
		
		
		String n1 = ""; 
		
		atividade02 = new Atividade02();
		
		
		n1 = JOptionPane.showInputDialog("Informe um número inteiro");
		atividade02.converter(n1);
		

	}
	//Método que converte de String para interger
	private  void converter(String n1) {
		
		try {
		Integer inteiro = Integer.valueOf(n1);
		atividade02.parImpar(inteiro);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Valor informado errado, apenas números inteiros", "Erro ", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
	//Método que verifica se o número é par ou impar
	private void parImpar(int inteiro) {
		
		try {
			 int resultado = inteiro%2;
			 if(resultado == 0) {
				 JOptionPane.showMessageDialog(null, "O numero "+ inteiro+" é par");
			 }else {
				 JOptionPane.showMessageDialog(null, "O numero "+ inteiro+" é impar");
			 }
			 
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Acounteceu um problema na conversão", "Erro ", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
