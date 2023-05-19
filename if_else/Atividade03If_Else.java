package if_else;

import javax.swing.JOptionPane;

public class Atividade03If_Else {
	/*
	 * 3. Escreva um programa que verifique a validade de uma senha fornecida pelo
	 * usuário. A senha válida é o número 1234. Devem ser impressas as seguintes
	 * mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a
	 * senha seja inválida.
	 * 
	 */

	public static void main(String[] args) {

		String senha = JOptionPane.showInputDialog("Digite o primeiro número inteiro: ");
		
		if(senha.equals("1234")) {
			JOptionPane.showMessageDialog(null,"ACESSO PERMITIDO","Liberado",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"ACESSO NEGADO","Senha incorreta",JOptionPane.WARNING_MESSAGE);
		}

	}

}
