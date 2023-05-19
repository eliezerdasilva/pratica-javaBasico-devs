package if_else;


import javax.swing.JOptionPane;

/*
 * 5. Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.
 */
public class Atividade05If_Else {
	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Informe o primeiro número");
		String n2 = JOptionPane.showInputDialog("Informe um segundo número");
		String n3 = JOptionPane.showInputDialog("Informe um terceiro número");
		try {
			Double D1 = Double.valueOf(n1);
			Double D2 = Double.valueOf(n2);
			Double D3 = Double.valueOf(n3);
			verificarOrdem(D1,D2,D3);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Informe apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	
	}
	//Método que verifica se a ordem dos numeros estão em forma crescente  
	public static void verificarOrdem(Double d1, Double d2, Double d3) {
	
		if(d1 != d2 && d1 != d3 && d3 != d2) {
			if(d1 < d2 && d1 < d3 && d2<d3) {
				JOptionPane.showMessageDialog(null,"A ordem dos números crescente é "+d1+" "+d2+" "+d3);
			}else {
				if(d2 < d1 && d2 < d3 && d1<d3) {
					JOptionPane.showMessageDialog(null,"A ordem dos números crescente é "+d2+" "+d1+" "+d3);
				}else {
					if(d3 < d1 && d3 < d2 && d2<d1) {
						JOptionPane.showMessageDialog(null,"A ordem dos números crescente é "+d3+" "+d2+" "+d1);
					}else {
						if(d1 < d2 && d1 < d3 && d3<d2) {
							JOptionPane.showMessageDialog(null,"A ordem dos números crescente é "+d1+" "+d3+" "+d2);
						}else {
							if(d2 < d1 && d2 < d3 && d3<d1) {
								JOptionPane.showMessageDialog(null,"A ordem dos númeroscrescente é "+d2+" "+d3+" "+d1);
							}else {
								JOptionPane.showMessageDialog(null,"A ordem dos números crescente é "+d3+" "+d1+" "+d2);
							}
						}
					}
				}
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Informe números diferentes", "Números iguais", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	

}
