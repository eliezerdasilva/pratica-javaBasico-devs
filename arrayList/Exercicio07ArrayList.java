package ExercicioArrayList;

import java.util.*;

/*
2. Crie duas listas de inteiros e calcule a interseção entre elas (ou seja, os números
que estão presentes nas duas listas).
 */
public class Exercicio07ArrayList {
    public static void main(String[] args) {

// Criando as duas listas de inteiros
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);


        Collection<Integer> intersecao = new HashSet<>(lista1);
        //é um retainAll é um método da interface Collection, que (mantem) o conteúdo que foi declarado e que está sendo comparado
        intersecao.retainAll(lista2);


        System.out.println("Interseção: (Os valores " + intersecao+" estão declarados  nas duas lista");

    }
}
