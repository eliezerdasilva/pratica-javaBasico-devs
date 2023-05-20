package switch_case;

import javax.swing.JOptionPane;

/*
 * 3. Faça um programa que receba dois números e execute as operações listadas a
seguir de acordo com a escolha do usuário:
 */
public class Atividade03Switch_Case {

	public static void main(String[] args) {

		String numer01 = JOptionPane.showInputDialog("Informe um número");
		String numero2 = JOptionPane.showInputDialog("Informe o segundo número");

		try {
			Float n1 = Float.valueOf(numer01);
			Float n2 = Float.valueOf(numero2);
			operacacaoUsuario(n1, n2);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	// Método que verifica a opção digitada pelo usuário
	public static void operacacaoUsuario(Float n1, Float n2) {

		String escolha = JOptionPane.showInputDialog("Informe o número da operação\r\n"
				+ "1 : Média entre os números digitados\r\n" + "2 : Diferença entre os números\r\n"
				+ "3 : Produto entre os números digitados\r\n" + "4 : Divisão do primeiro pelo segundo\r\n");
		switch (escolha) {
		case "1":
			JOptionPane.showMessageDialog(null, " A Média é : " + (n1 + n2) / 2);
			break;
		case "2":
			JOptionPane.showMessageDialog(null, " A diferença entre os números são : " + (n2 - n1));
			break;
		case "3":
			JOptionPane.showMessageDialog(null, " O produto entre os números são : " + (n1 * n2));
			break;
		case "4":
			JOptionPane.showMessageDialog(null, " A divisão do primeiro pelo segundo é : " + n1 / n2);
			break;

		default:
			JOptionPane.showMessageDialog(null, " Escolha invalida ");
			break;
		}
	}

}
