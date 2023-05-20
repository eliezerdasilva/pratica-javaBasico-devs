package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * 3. Dado um array de inteiros, imprima a soma de todos os elementos.
 */
public class Atividade03LR {

	public static void main(String[] args) {
		 int[] num = { 1, 2, 3, 4,5,6,7,8,9 };
	        int soma = 0;

	        for (int i = 0; i < num.length; i++) {
	            soma += num[i];
	        }

	        JOptionPane.showMessageDialog(null,"A soma de todos os elementos do array é: " + soma);

	}

}
