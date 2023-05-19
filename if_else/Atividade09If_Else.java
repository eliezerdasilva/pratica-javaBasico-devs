package if_else;

import javax.swing.JOptionPane;

/*
 * 9. Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que
o usuário não informará valores iguais
 */
public class Atividade09If_Else {

	public static void main(String[] args) {
			
		String numero1 = JOptionPane.showInputDialog("Digite um valor inteiro: ");
		String numero2 = JOptionPane.showInputDialog("Digite um segundo valor inteiro: ");
		String numero3 = JOptionPane.showInputDialog("Digite um terceiro valor inteiro: ");
		
		try {
			Integer valor1 = Integer.valueOf(numero1);
			Integer valor2= Integer.valueOf(numero2);
			Integer valor3 = Integer.valueOf(numero3);
			numeroMaior(valor1,valor2,valor3);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}
	public static void numeroMaior(Integer valor1, Integer valor2, Integer valor3) {
		
		if(valor1>valor2 && valor1>valor3) {
			JOptionPane.showMessageDialog(null, "o maior deles é : "+valor1);
			
		}else {
			if(valor2>valor1 && valor2>valor3){
				JOptionPane.showMessageDialog(null, "o maior deles é : "+valor2);
			}else {
				if(valor3>valor1 && valor3>valor2) {
					JOptionPane.showMessageDialog(null, "o maior deles é : "+valor3);
				}else {
					JOptionPane.showMessageDialog(null, "Entrada inválida, informe números diferentes", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
	}

}
