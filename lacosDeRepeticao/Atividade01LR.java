package lacosDeRepeticao;


import javax.swing.JOptionPane;

/*
 * 1. Dado um número inteiro informado pelo usuário, imprima todos os números pares
entre 0 e esse número.

 */
public class Atividade01LR {

	public static void main(String[] args) {

		String numero = JOptionPane.showInputDialog("Informe um número inteiro");
		try {
			Integer num = Integer.valueOf(numero);
			verificarPar(num);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	//Método que verifica se o número é par ou não 
	private static void verificarPar(Integer num) {

		String numerosParesStr = "Números pares entre 0 e " + num + ": \n";

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                numerosParesStr += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, numerosParesStr);

	}
}
