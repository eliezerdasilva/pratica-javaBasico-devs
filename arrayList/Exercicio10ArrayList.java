package ExercicioArrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
5. Crie uma lista de strings e ordene a lista por ordem alfabética inversa.
 */
public class Exercicio10ArrayList {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Original");
        listaStrings.add("Aposentado");
        listaStrings.add("Arame");
        listaStrings.add("Selos");
        listaStrings.add("Pouco");
        listaStrings.add("Palavras");

        //Sort ordena por ordem, e reverseOrder inverte a posição
        Collections.sort(listaStrings, Collections.reverseOrder());


        for (String stg : listaStrings) {
            System.out.println(stg);
        }

    }
}
