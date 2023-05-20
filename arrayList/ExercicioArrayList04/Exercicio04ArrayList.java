package ExercicioArrayList.ExercicioArrayList04;

import java.util.ArrayList;
import java.util.Collections;

/*
4. Crie uma lista de objetos da classe Pessoa, com nome e idade, e ordene a lista por
idade.
 */
public class Exercicio04ArrayList {
    public static void main(String[] args) {
        ArrayList<Pessoa> listPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Eliezer",18);
        Pessoa p2 = new Pessoa("Gabriel",24);
        Pessoa p3 = new Pessoa("Felipe",12);
        listPessoas.add(p1);
        listPessoas.add(p2);
        listPessoas.add(p3);

        //Verifica oque foi proposto na implemtação da classe Comparable
        Collections.sort(listPessoas);


        for (Pessoa pessoa : listPessoas) {
            System.out.println(pessoa);
        }


    }
}
