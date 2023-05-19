package if_else;



import javax.swing.JOptionPane;

/*
 * 7. Escreva um programa para ler o número de lados de um polígono regular e a medida do
   lado (em cm). Calcular e imprimir o seguinte:
−  Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
−  Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
−  Se o número de lados for igual a 5 escrever PENTÁGONO.

 */
public class Atividade07If_Else {

	public static void main(String[] args) {

		String poligono = JOptionPane.showInputDialog("Digite quantos lados tem o polígono: ");
		try {
			Integer lados = Integer.valueOf(poligono);
			calcularArea(lados);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	//Método que calcula a area do polígono recebendo os lados
	public static void calcularArea(int lados) {
		if (lados == 3) {
			String altura = JOptionPane.showInputDialog("Digite a altura do polígono: ");
			String base = JOptionPane.showInputDialog("Digite a base do polígono: ");
			try {
				Float alturaFloat1 = Float.valueOf(altura);
				Float baseFloat2 = Float.valueOf(base);

				JOptionPane.showMessageDialog(null, "TRIÂNGULO, sua área é " + (alturaFloat1 * baseFloat2) / 2);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			if (lados == 4) {
				String area1 = JOptionPane.showInputDialog("Digite o lado do QUADRADO: ");

				try {
					Float areaFloat1 = Float.valueOf(area1);
					JOptionPane.showMessageDialog(null, "QUADRADO, sua área é " + Math.pow(areaFloat1,2));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				if (lados == 5) {
					JOptionPane.showMessageDialog(null, "PENTÁGONO");
				} else {
					JOptionPane.showMessageDialog(null, "Programa ainda não aceita esse polígono");
				}
			}
		}

	}

}
