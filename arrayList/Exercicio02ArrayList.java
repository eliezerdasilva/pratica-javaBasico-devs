package ExercicioArrayList;

import java.util.ArrayList;

/*
2. Crie uma lista de inteiros com os números de 1 a 5 e imprima cada elemento da
lista.
 */
public class Exercicio02ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);


        //Duas formas de imprimir o valores do arrayList
        for(int i = 0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
        for (Integer ft : numeros) {
            System.out.println(ft.toString());

        }

    }
}
