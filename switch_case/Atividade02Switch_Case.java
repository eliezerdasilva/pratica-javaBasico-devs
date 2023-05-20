package switch_case;

import javax.swing.JOptionPane;

/*
 *  2 Faça um programa que receba duas notas, calcule e mostre a média aritmética e
mensagem que está na tabela a seguir:
 */
public class Atividade02Switch_Case {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe o primeira nota");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota");

		try {
			Float notafl1 = Float.valueOf(nota1);
			Float notafl2 = Float.valueOf(nota2);
			calcultarNota(notafl1,notafl2);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, somente números", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	
	}
	
	public static void calcultarNota(Float notafl1, Float notafl2) {
		
		float media = (notafl1+notafl2)/2;
		Integer mediaInt = null ;
		if(media>4 && media<6) {
			mediaInt = (int)Math.ceil(media);
		}else {
			if(media<7) {
				mediaInt = (int)Math.floor(media);
			}else {
				mediaInt = (int)media;
			}
		}
		
		/*
		 * Comentário: Conforme a resolução do exercício, tente procurar um método que pode-se identificar um número ate outro, nisso achei o execício na web, só que a diferença é que ele
		é programado em C++, e essa linguagem tem um comando que possibilita realizar o comando direto "EX case 3 ... 6 :" pegando 3,4,5 e 6. Pelo que pesquisei tanto na web e na documentação
		existe um comando para isso.
		 */
		switch(mediaInt) {
		case 1,2,3,4 :
			JOptionPane.showMessageDialog(null, "Reprovado ");
		break;
		case 5,6 :
			JOptionPane.showMessageDialog(null, "Exame ");
		break;
		case 7,8,9,10 :
			JOptionPane.showMessageDialog(null, "Aprovado ");
		break;
		
	
		}
		
		
	}

}
