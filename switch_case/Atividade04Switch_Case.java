package switch_case;

import javax.swing.JOptionPane;

/*
 * O cardápio de uma casa de lanches é dado pela tabela abaixo:
 * 
 *  Escreva um algoritmo que leia o código do item adquirido pelo consumidor e a quantidade,
	calculando e mostrando o valor a pagar. Não será necessário exibir o produto e o valor,
	somente o valor final
 */
public class Atividade04Switch_Case {

	public static void main(String[] args) {

		String codigo = JOptionPane.showInputDialog("Informe o primeira o código do produto \r\n"
				+ "100 : Cachorro quente \r\n" + "101 : Bauru simples \r\n" + "102 : Bauru com ovo \r\n"
				+ "103 : Hambúrguer \r\n" + "104 : Cheeseburguer \r\n" + "105 : Refrigerante ");
		String quantidade = JOptionPane.showInputDialog("Informe a quantidade de produto consumido :");

		try {
			Integer quant = Integer.valueOf(quantidade);
			precoProduto(quant, codigo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void precoProduto(Integer quant, String codigo) {
		switch (codigo) {
		case "100":
			JOptionPane.showMessageDialog(null, " O preço é : " + quant * 1.7);
			break;
		case "101":
			JOptionPane.showMessageDialog(null, "  O preço é : " + quant * 2.3);
			break;
		case "102":
			JOptionPane.showMessageDialog(null, "  O preço é : " + quant * 2.6);
			break;
		case "103":
			JOptionPane.showMessageDialog(null, "  O preço é : " + quant * 2.4);
			break;
		case "104":
			JOptionPane.showMessageDialog(null, "  O preço é : " + quant * 2.5);
			break;
		case "105":
			JOptionPane.showMessageDialog(null, "  O preço é : " + quant * 1);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Escolha invalida, informe os código existentes ");
			break;
		}

	}

}
