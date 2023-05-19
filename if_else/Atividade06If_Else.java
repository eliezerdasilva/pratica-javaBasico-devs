package if_else;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*
 * 6. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
utilizando as seguintes
Fórmulas:
- para homens: (72.7 * Altura) – 58
- para mulheres: (62.1 * Altura) – 44.7

 */
public class Atividade06If_Else {

	public static void main(String[] args) {

		String altura = JOptionPane.showInputDialog("Informe sua altura : (#.##)");
		

		
		try {
			Float alturaFloat = Float.valueOf(altura);
			calcularPeso(alturaFloat);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}

	public static void calcularPeso(float altura) {
		
		String sexo = JOptionPane.showInputDialog("Informe sua sexo :  ");
		sexo = sexo.toUpperCase();
		char s = sexo.charAt(0);
		float soma;
		DecimalFormat numero = new DecimalFormat("0.00");
		if (s == 'F') {
			soma = (float) ((62.1 * altura) - 44.7);
			JOptionPane.showMessageDialog(null, "Peso ideal " + numero.format(soma));
		} else {
			if (s == 'M') {
				soma = (float) ((72.7 * altura) - 58); 
				JOptionPane.showMessageDialog(null, "Peso ideal " + numero.format(soma));
			} else {

				JOptionPane.showMessageDialog(null, "Entrada inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

}
