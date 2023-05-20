package ExercicioArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/*
5. Crie uma lista de strings e remova todos os elementos da lista que contenha a letra
"a".
 */
public class Exercicio05ArrayList {
    public static void main(String[] args) {

        ArrayList<String> listPalavras = new ArrayList<String>();
        listPalavras.add("Espiral");
        listPalavras.add("Noite");
        listPalavras.add("Barriga");
        listPalavras.add("Fio");
        listPalavras.add("Purificador");
        listPalavras.add("Tio");



        //Primeira  forma de resolver
        for (int i = 0; i < listPalavras.size(); i++) {

            if(listPalavras.get(i).indexOf("a")>0){
                listPalavras.remove(listPalavras.get(i));
            }

        }
        for (String  palavra : listPalavras) {
            System.out.println(palavra.toString());

        }
        //Segunda forma que ultiliza a interface Iterator
        Iterator<String> iterator = listPalavras.iterator();
        //Um dos método que a interface possui, é o hasNext que retorna um valor booleano
        while (iterator.hasNext()) {
            //next retorna o valor
            String palavra = iterator.next();
            //Contains verifica e logo após no comando if se for verdade remove
            if (palavra.contains("a")) {
                iterator.remove();
            }
        }

        // Exibição dos elementos da lista após a remoção
        for (String palavra:  listPalavras) {
            System.out.println(palavra  );
        }



    }


}
