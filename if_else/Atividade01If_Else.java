package if_else;

import javax.swing.JOptionPane;

/*
 * 1. Escreva um programa para ler 2 valores (considere que não serão informados valores
iguais) e escreva o maior deles.
 */
public class Atividade01If_Else {

	public static Atividade01If_Else atividade01;

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Informe o primeiro número");
		String n2 = JOptionPane.showInputDialog("Informe um segundo número");
		try {
			Double num1 = Double.valueOf(n1);
			Double num2 = Double.valueOf(n2);
			atividade01 = new Atividade01If_Else();
			atividade01.maiorMenor(num1, num2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void maiorMenor(Double num1, Double num2) {

		if (num1 < num2) {
			JOptionPane.showMessageDialog(null, num2 + " É o maior número");
		} else {
			if (num1 > num2) {
				JOptionPane.showMessageDialog(null, num1 + " É o maior número");
			} else {
				JOptionPane.showMessageDialog(null, "Os números são iguais");
			}
		}

	}

}
