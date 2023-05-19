package if_else;

import javax.swing.JOptionPane;

/*
 * 8. Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso.
− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
IDENTIFICADO.

 */
public class Atividade08If_Else {

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
					if(lados<3) {
						JOptionPane.showMessageDialog(null, "NÃO É UM POLÍGONO.");
					}else {
						JOptionPane.showMessageDialog(null, "POLÍGONO NÃO "
								+ "IDENTIFICADO.");
					}
					
				}
			}
		}

	}
	

}
