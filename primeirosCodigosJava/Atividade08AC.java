package primeirosCodigosJava;


import javax.swing.JOptionPane;

/*
 * Escreva um programa que verifique se um número é primo ou não. Utilize o operador de resto da divisão para verificar se o número é divisível por algum outro número além de 1 e ele mesmo.
 */
public class Atividade08AC {

	public static void main(String[] args) {
		
		String numeroString = JOptionPane.showInputDialog("Informe um número inteiro com três digitos");  
		try {
			Integer num = Integer.valueOf(numeroString);
			if (num <= 1) {
				JOptionPane.showMessageDialog(null, " não é um número primo.");
	        } else {
	            boolean primo = true;
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    primo = false;
	                    break;
	                }
	            }

	            if (primo) {
	            	JOptionPane.showMessageDialog(null,num + " é um número primo.");
	            } else {
	            	JOptionPane.showMessageDialog(null,num+ " não é um número primo.");
	            }
	        }
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Apenas números inteiros","ERRO", JOptionPane.ERROR_MESSAGE);
		}


        
		

	}

}
