package primeirosCodigosJava;

import javax.swing.JOptionPane;
/*
 * Escreva um programa que leia dois números inteiros e exiba o resultado da soma, subtração, multiplicação, divisão e resto da divisão dos dois números.
 */
public class Atividade01 {

	public static void main(String[] args) {
		
		String n1 = "", n2 = "";
		Integer inteiro1 = 0, inteiro2 = 0;
		try {
			 n1 = JOptionPane.showInputDialog("Informe um numero inteiro : ");
			 inteiro1 = Integer.valueOf(n1);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null  ," O valor "+n1+" é Inválido","Erro " ,JOptionPane.ERROR_MESSAGE);
		}
		try {
			 n2 = JOptionPane.showInputDialog("Informe um numero inteiro : ");
			 inteiro2 = Integer.valueOf(n2);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null  ," O valor "+n2+" é Inválido","Erro ", JOptionPane.ERROR_MESSAGE);
		}
		try {
			int soma= inteiro1 + inteiro2;	
			int divisao= inteiro1/inteiro2;
			int multiplicacao = inteiro1*inteiro2;
			int subtracao = inteiro1-inteiro2;
			int resto = inteiro1%inteiro2;
			JOptionPane.showMessageDialog(null, "A Soma de "+inteiro1+" + "+inteiro2+" = "+soma+"\n" 
					+ " A divisão dos numeros "+inteiro1+" / " + inteiro2+ " =  " +   divisao+ "\n"
					+ " A multiplicação dos números "+ inteiro1 + " * " + inteiro2 + " = "+ multiplicacao + "\n"
					+ " A subtração dos números " + inteiro1 + " - " + inteiro2 + " =  " +  subtracao+"\n"
					+ " O resto da divisão dos números  "+inteiro1+" e " + inteiro2 + " = " + resto + "\n" 
					 
					);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null  ," Não foi possivel realizar as operções","Erro ", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

}
