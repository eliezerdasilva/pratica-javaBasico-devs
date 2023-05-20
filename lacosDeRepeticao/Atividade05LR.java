package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * 5. Escreva um programa que lê uma sequência de palavras informadas pelo usuário e
mostra a palavra de maior comprimento.
 */
public class Atividade05LR {

	

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Informe palavras ou 0 para sair");
		int quatLetra = 0;
		String resultado = "Nenhuma palavra digitada";
		while(!frase.equals("0")) {
			if(frase.length()>quatLetra) {
				quatLetra = frase.length();
				resultado = frase;
				frase = JOptionPane.showInputDialog("Informe palavras ou 0 para sair");
			}
		
		}
		JOptionPane.showMessageDialog(null, "A maior palavra é : " +resultado);
	}
	
}
