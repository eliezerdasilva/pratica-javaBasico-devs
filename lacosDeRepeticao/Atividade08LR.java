package lacosDeRepeticao;

import javax.swing.JOptionPane;

/*
 * 3. Dado um número inteiro n informado pelo usuário, calcule o n-ésimo número de
Fibonacci usando um laço de repetição.

 */
public class Atividade08LR {

	public static void main(String[] args)  {

		String num = JOptionPane.showInputDialog("Informe um número inteiro");
    	Integer n = Integer.valueOf(num);
		
    	var valorFibonaci = fibonacciCalc(n);
    	JOptionPane.showMessageDialog(null,"O " + num + " -ésimo número de Fibonacci é: " + valorFibonaci);
    }
    public static int fibonacciCalc(int n) {
    	if(n<=1) {
    		return n;
    	}else {
    		return fibonacciCalc(n-1)+fibonacciCalc(n-2);
    	}
    }
}
