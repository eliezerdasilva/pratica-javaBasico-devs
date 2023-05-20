package switch_case;

import javax.swing.JOptionPane;

/*
 *  1 Leia o código de um determinado produto e mostre sua classificação. Utilize a
seguinte tabela como referência:

 */
public class Atividade01Switch_Case {

	public static void main(String[] args) {
		
		String codigo = JOptionPane.showInputDialog("Digite o código de classificação: ");
	
		
		try {
			Integer codigoNumero = Integer.valueOf(codigo);
			verificarSwitchCase(codigoNumero);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
		
	
	}

	//Método que verifica qual classificação é o código
	private static void verificarSwitchCase(Integer codigoNumero) {
		int i = 8;

		String codigo= String.valueOf(codigoNumero);
		
		//Teste para saber se o código digitado foi de 8 a 15, invés de declarar "8","9"...."15"
		while(i<=codigoNumero && 16>codigoNumero) {
			if(i==codigoNumero) {
				codigo= "d8_15";
			}
			i++;
		}
		
		switch (codigo) {
		case "1":
			JOptionPane.showMessageDialog(null,"Alimento não-perecível");
			break;

		case "2","3","4":
			JOptionPane.showMessageDialog(null,"Alimento perecível ");
		break;
		case "5","6":
			JOptionPane.showMessageDialog(null,"Vestuário");
		break;
		case "7":
			JOptionPane.showMessageDialog(null,"Higiene pessoal");
			break;
		case "d8_15":
			JOptionPane.showMessageDialog(null,"Limpeza e utensílios domésticos");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Código inválido");
			break;
		}
		
		
	}

	

}

