package if_else;

import javax.swing.JOptionPane;

/*
 * 11. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o
triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que:
− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
 */
public class Atividade11If_Else {

	public static void main(String[] args) {
	
		String angulo1 = JOptionPane.showInputDialog("Digite o primeiro ângulo do triângulo : ");
		String angulo2 = JOptionPane.showInputDialog("Digite o segundo ângulo do triângulo : ");
		String angulo3 = JOptionPane.showInputDialog("Digite o terceiro angulo do triângulo : ");
		
		
		try {
			Float valor1 = Float.valueOf(angulo1);
			Float valor2= Float.valueOf(angulo2);
			Float valor3 = Float.valueOf(angulo3);
			calculaAngulo(valor1,valor2,valor3);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}
	public static void calculaAngulo(Float valor1, Float valor2, Float valor3) {
		
		if (valor1 == 90 || valor2 == 90 || valor3 == 90) {
			JOptionPane.showMessageDialog(null,"Triângulo Retângulo: possui um ângulo reto. (igual a 90º)");
        } else if (valor1 > 90 || valor2 > 90 || valor3 > 90) {
        	JOptionPane.showMessageDialog(null,"Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)");
        } else {
        	JOptionPane.showMessageDialog(null,"Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)");
        }
		
	}

}
