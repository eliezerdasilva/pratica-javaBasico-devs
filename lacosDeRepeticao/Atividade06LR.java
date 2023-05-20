package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * Agora um pouco mais avançado:
1. Dado um array de inteiros, encontre o maior número e imprima a posição onde ele
se encontra no array
 */
public class Atividade06LR {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 3, 9, 24,6,123 };
        int maior = num[0];
        int posicaoMaior = 0;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
                posicaoMaior = i;
            }
        }

        JOptionPane.showMessageDialog(null,"O maior número do array é " + maior + " e se encontra na posição " + (posicaoMaior+1));

	}

}
