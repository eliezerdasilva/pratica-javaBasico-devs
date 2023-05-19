package if_else;

import javax.swing.JOptionPane;

/*
 * 10. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é
Equilátero, Isósceles ou Escaleno. Sendo que:
− Triângulo Equilátero: possui os 3 lados iguais.
− Triângulo Isóscele: possui 2 lados iguais.
− Triângulo Escaleno: possui 3 lados diferentes
 */
public class Atividade10If_Else {

	public static void main(String[] args) {
		
		String lado1 = JOptionPane.showInputDialog("Digite o primeiro  lado do triângulo : ");
		String lado2 = JOptionPane.showInputDialog("Digite o segundo  lado do triângulo: ");
		String lado3 = JOptionPane.showInputDialog("Digite o terceiro  lado do triângulo: ");
		
		
		try {
			Float valor1 = Float.valueOf(lado1);
			Float valor2= Float.valueOf(lado2);
			Float valor3 = Float.valueOf(lado3);
			tipoTriangulo(valor1,valor2,valor3);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}
	//Método verifica qual tipo do triângulo é 
	public static void tipoTriangulo(float valor1, float valor2, float valor3) {
		
	if(valor1 == valor2 && valor1 == valor3) {
		JOptionPane.showMessageDialog(null, "Triângulo Equilátero: possui os 3 lados iguais.");
	}else {
		if((valor1==valor2 && valor1!=valor3)||(valor2==valor1 && valor2!=valor3)||(valor3==valor1 && valor3!=valor2)){
			JOptionPane.showMessageDialog(null, "Isóscele: possui 2 lados iguais");
		}else {
			JOptionPane.showMessageDialog(null, "Triângulo Escaleno: possui 3 lados diferentes");
		}
	}
		
		
	}

}
