package if_else;

import javax.swing.JOptionPane;

/*
 * 4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25
se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs
compradas, calcule e escreva o valor total da compra.
 */
public class Atividade04If_Else {

	public static void main(String[] args) {

		String macas = JOptionPane.showInputDialog("Informe o primeiro número");
		try {
			Integer macasInt = Integer.valueOf(macas);
			precoMacas(macasInt);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	//Método que calcula o preço da maça, verificando a quantidade. 
	public static void precoMacas(Integer macasInt) {
		if(macasInt<12) {
			JOptionPane.showMessageDialog(null, "O preço das maça é de : "+macasInt*0.30);
		}else {
			JOptionPane.showMessageDialog(null, "O preço das maça é de : "+macasInt*0.25);
		}
		
	}

}
