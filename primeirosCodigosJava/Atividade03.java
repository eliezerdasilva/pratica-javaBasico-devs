package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que leia a idade de uma pessoa e verifique se ela é maior ou igual a 18 anos utilizando o operador relacional de maior ou igual.s
 * 
 */
public class Atividade03 {

	public static Atividade03 atividade03;

	public static void main(String[] args) {

		String resultado = JOptionPane.showInputDialog("Informe a idade");
		atividade03 = new Atividade03();
		atividade03.converte(resultado);


	}

	private void converte(String resultado) {
		try {
			Integer inteiro = Integer.valueOf(resultado);
			atividade03.indetificadorIdade(inteiro);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Problema ao converter, informe apenas números inteiros", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	private void indetificadorIdade(Integer inteiro) {

		if (inteiro < 18) {
			JOptionPane.showMessageDialog(null, "Menor de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}

	}

}
