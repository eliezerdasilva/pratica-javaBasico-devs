package lacosDeRepeticao;

/*
 * 5. Dado um array de inteiros, calcule a mediana (valor central) dos elementos usando
um laço de repetição. Se o número de elementos do array for par, a mediana será a
média dos dois valores centrais
 */
public class Atividade10LR {

	public static void main(String[] args) {
		int[] array = {5, 2, 6, 1, 8, 4, 9 ,9};
        double mediana = calcularMediana(array);
        System.out.println("Mediana: " + mediana);
	}
		//Ordena
		public static void ordenar(int[] array) {

	        int n = array.length;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n-i-1; j++) {
	            	//Verifica se o número da posicão x é maior que o próximo número
	                if (array[j] > array[j+1]) {
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                }
	            }
	        }
	    }
	    
		
	    public static double calcularMediana(int[] array) {
	    	//Método que ordena os números
	    	ordenar(array);
	        int n = array.length;
	        //Verifica a divisão 
	        if (n % 2 == 0) {
	            return (array[n/2] + array[n/2-1])/2.0;
	        } else {
	            return array[n/2];
	        }
	    

	}

}
