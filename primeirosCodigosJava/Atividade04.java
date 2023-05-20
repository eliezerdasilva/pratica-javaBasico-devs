package primeirosCodigosJava;


import javax.swing.JOptionPane;

/*
 * Escreva um programa que leia duas strings e verifique se elas são iguais utilizando o operador lógico de igualdade.
 */
public class Atividade04 {

	public static Atividade04 atividade04;
	
	public static void main(String[] args) {
		
		atividade04 = new Atividade04();
		String s1= JOptionPane.showInputDialog("Informe uma String");
		String s2= JOptionPane.showInputDialog("Informe uma String");
		atividade04.verificarString(s1 , s2);
		

	}
	//Método que verifica se as String são iguais ou diferentes 
	private void verificarString(String s1, String s2) {
		
		if(s1.equals(s2)) {
			JOptionPane.showMessageDialog(null,"As duas String são iguais");
		}else {
			JOptionPane.showMessageDialog(null,"As String são diferentes");
			
		}
		
		
	}

}
