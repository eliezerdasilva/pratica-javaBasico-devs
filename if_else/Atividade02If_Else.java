package if_else;

import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * 2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma
mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o
mês em que ela nasceu).

 */
public class Atividade02If_Else {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Informe o ano de nascimento");

		int quatString = n1.length();
		if (quatString == 4) {
			try {
				Integer ano = Integer.valueOf(n1);
				anoVotacao(ano);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Informes apenas números inteiros", "Erro",
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Informes 4 dígitos", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static void anoVotacao(int ano) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int soma = year - ano;
		if (soma < 16) {
			JOptionPane.showMessageDialog(null, "Você não podera votar esse ano");
		} else {
			JOptionPane.showMessageDialog(null, "Você já podera votar esse ano");
		}

	}

}
