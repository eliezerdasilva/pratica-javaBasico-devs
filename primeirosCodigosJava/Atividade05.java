package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que calcule a média de três notas e verifique se o aluno foi aprovado ou reprovado utilizando o operador lógico de comparação. Considere que a média para aprovação é 7.0.
 */
public class Atividade05 {
	
	public static Atividade05 atividade05;

	public static void main(String[] args) {
	
		atividade05 = new Atividade05();
		String nota1 = JOptionPane.showInputDialog("Informe uma nota");
		String nota2 = JOptionPane.showInputDialog("Informe uma nota");
		String nota3 = JOptionPane.showInputDialog("Informe uma nota");
		atividade05.converteFloat(nota1, nota2, nota3);
		
	}

	/**
	 * @param nota1
	 * @param nota2
	 * @param nota3
	 */
	private void converteFloat(String nota1, String nota2, String nota3) {
		
		try {
		Float n1 = Float.valueOf(nota1);
		Float n2 = Float.valueOf(nota2);
		Float n3 = Float.valueOf(nota3);
		float soma = n1+n2+n3;
		atividade05.aprovadoReprovado(soma);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null," Erro ao converter, informe apenas números", "Erro", JOptionPane.DEFAULT_OPTION);
		}
		
	}

	/**
	 * @param soma
	 */
	private void aprovadoReprovado(float soma) {
		soma = soma /3;
		if(soma>=7) {
			JOptionPane.showMessageDialog(null, "Parabéns, aprovado. Sua nota foi : "+soma);
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado. Sua nota foi : "+soma);
		}
		
	}

}
