package primeirosCodigosJava;

import javax.swing.JOptionPane;

/*
 * Escreva um programa que leia um número inteiro de três dígitos e exiba a soma dos seus dígitos.
 * 
 */
public class Atividade07AC {
	
	public static Atividade07AC atividade07ac;

	public static void main(String[] args) {
		 
	    //Primeira forma do exercício
		String numeroString = JOptionPane.showInputDialog("Informe um número inteiro com três digitos");  
		try {
			Integer num = Integer.valueOf(numeroString);
			  int soma = 0;

		     
		        if (num < 100 || num > 999) {
		        	JOptionPane.showMessageDialog(null,"Entrada inválida.");
		        } else {
		      
		            int digito = num;
		            while (digito > 0) {
		                soma += digito % 10;
		                digito /= 10;
		            }
		            JOptionPane.showMessageDialog(null,"A soma dos dígitos é: "+soma);
		        }

		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Apenas Números");
		}
	  
		//Segunda forma do exercício
		atividade07ac = new Atividade07AC();
		String resultado = JOptionPane.showInputDialog("Outro método para resolver o exercício");
		int soma = atividade07ac.metodoDois(resultado);
	    JOptionPane.showMessageDialog(null,"A soma dos dígitos é: "+soma );    
	     
	      
	        

	}
	//Método para a segunda resolução que lê os três primeiros digitos informados. 
	public int metodoDois(String numero) {
		int soma = 0; 
		int i = 1; 
		while(i<=3) {
			if(i==1) {
				try {
				Integer n= Integer.valueOf(numero.substring(0,1));
				soma += n; 
				i++;
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Apenas Números");
				}
			}else {
				if(i==2) {
					try {
						Integer n= Integer.valueOf(numero.substring(1,2));
						soma += n; 
						i++;
						}catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Apenas Números");
						}
				}else {
					if(i==3) {
					try {
						Integer n= Integer.valueOf(numero.substring(2,3));
						soma += n; 
						i++;
						}catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Apenas Números");
						}
					}
				}
			}
		}
		return soma;
		
	}

}
