package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que calcule a área de um círculo, dado o seu raio. Utilize a fórmula A = π * r^2 e o valor de π como 3.14.
 */
public class Atividade06AC {

	public static Atividade06AC atividade06ac;

	public static void main(String[] args) {

		String raio = JOptionPane.showInputDialog("Informe o raio de circulo");
		atividade06ac = new Atividade06AC();
		atividade06ac.converteStringDouble(raio);
	}

	//Método que converte de String para Double
	public void converteStringDouble(String raio) {
		try {
			Double raioInteiro = Double.valueOf(raio);
			atividade06ac.areaCirculo(raioInteiro);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números");
		}
	}

	//Método que calcula a área do circulo
	public void areaCirculo(double raio) {

		double resultado = Math.PI * (raio * raio);
		JOptionPane.showMessageDialog(null, "A área do circulo é de : " + resultado);

	}

}
