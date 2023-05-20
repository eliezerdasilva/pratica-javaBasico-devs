package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * Dado um número inteiro informado pelo usuário, imprima todos os números ímpares
entre 1 e esse número.
 */
public class Atividade04LR {
	
	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Informe um número inteiro");
		try {
			Integer num = Integer.valueOf(numero);
			verificarImpar(num);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	//Método que verifica se o número é Impar ou não 
	private static void verificarImpar(Integer num) {

		String numerosImparesStr = "Números impares entre 1 e " + num + ": \n";

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
            	numerosImparesStr += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, numerosImparesStr);

	}
}
