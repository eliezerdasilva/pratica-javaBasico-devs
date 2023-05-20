package ExercicioList;

import java.util.Arrays;
import java.util.Random;

/*
3. Crie um array com 10 elementos e preencha-o com números aleatórios. Em seguida,
exiba todos os números pares do array.
 */
public class Exercicio03Array {

    public static void main(String[] args) {
        var array = new int [10];
        var randow = new Random();

        for(int count = 0;count<array.length; count++ ){
            array[count] = randow.nextInt();
        }
        System.out.println("Números pares:");
        for (int j = 0; j<array.length;j++){
            if(array[j]%2==0){
                System.out.println(array[j]);
            }
        }

    }
}
