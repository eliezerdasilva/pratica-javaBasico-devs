package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * 2. Escreva um programa que lê uma sequência de números informados pelo usuário e
mostra a média aritmética desses números.

 */
public class Atividade02LR {

;

	public static void main(String[] args) {
		 

		String numero = JOptionPane.showInputDialog("Informe um número ou 0 para sair");
		 	int contador = 0;
	        double soma = 0;

	        while (!numero.equals("0")) {
	        	try {
	        		Double numerodb = Double.valueOf(numero);
	 	            soma += numerodb;
		            contador++;
		            numero = JOptionPane.showInputDialog("Informe um número  ou 0 para sair ");
	        	}catch (Exception e) {
	        		JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
	        		break;
				}
	     
	        }

	        if (contador == 0) {
	            System.out.println("Nenhum número foi informado!");
	        } else {
	            double media = soma / contador;
	            System.out.println("A média aritmética dos números informados é " + media);
	        }

	}

}
