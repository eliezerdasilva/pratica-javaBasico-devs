package ExercicioArrayList.ExercicioArrayList08;
/*
3. Crie uma lista de objetos da classe Pessoa, com nome e idade, e divida a lista em
duas listas distintas: uma com pessoas com idade maior ou igual a 18 anos e outra
com pessoas com idade menor que 18 anos.
 */

import java.util.ArrayList;

public class Exercicio08ArrayList {

    public static void main(String[] args) {


        ArrayList<Pessoa> listPessoas = new ArrayList<>();


        var p1 = new Pessoa("Eliézer", 25);
        var p2 = new Pessoa("Pedro", 17);
        var p3 = new Pessoa("Eduardo", 20);
        var p4 = new Pessoa("Maria Carol", 15);
        var p5 = new Pessoa("Carlos", 40);

        listPessoas.add(p1);
        listPessoas.add(p2);
        listPessoas.add(p3);
        listPessoas.add(p4);
        listPessoas.add(p5);

        ArrayList<Pessoa> maiorIdade = new ArrayList<>();
        ArrayList<Pessoa> menorDeIdade = new ArrayList<>();


        for (Pessoa pessoa : listPessoas) {

            if (pessoa.getIdade() >= 18) {
                maiorIdade.add(pessoa);
            } else {
                menorDeIdade.add(pessoa);
            }
        }

        System.out.println("Maiores de idade:");
        for (Pessoa pessoa : maiorIdade) {
            System.out.println(pessoa);
        }

        System.out.println("Menores de idade:");
        for (Pessoa pessoa : menorDeIdade) {
            System.out.println(pessoa);
        }
    }
}
