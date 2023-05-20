package ExercicioArrayList;

import java.util.ArrayList;


/*
3. Crie uma lista de doubles com valores aleatórios e calcule a média dos valores.
 */
public class Exercicio03ArrayList {
    public static void main(String[] args) {

        ArrayList<Double> listNumeros = new ArrayList<Double>();
        listNumeros.add(1.3);
        listNumeros.add(5.5);
        listNumeros.add(2.5);
        listNumeros.add(24.0);
        listNumeros.add(3.1);
        listNumeros.add(5.1);
        listNumeros.add(9.3);
        listNumeros.add(5.1);

        double soma1 =0;
        double soma2 = 0;

        //Duas formas de imprimir o valores do arrayList

        for(int i = 0; i<listNumeros.size(); i++){
        soma1 += listNumeros.get(i);
        }
        System.out.println("Primeiro método: "+soma1);
        for (Double listN : listNumeros) {
            soma2+= listN;

        }
        System.out.println("Segundo método : " +soma2);





    }
}
