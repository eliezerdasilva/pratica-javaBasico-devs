package ExercicioArrayList.ExercicioArrayList06;

import java.util.ArrayList;
import java.util.Collections;

/*
1. Crie uma lista de objetos da classe Produto, com nome e preço, e ordene a lista por
preço.
 */
public class Exercicio06ArrayList {
    public static void main(String[] args) {

        ArrayList<Produto> listProduto = new ArrayList<Produto>();
        Produto p1 = new Produto("shampoo",12.5f);
        Produto p2 = new Produto("sabonete",2.50f);
        Produto p3 = new Produto("condicionador",15.5f);
        Produto p4 = new Produto("creme-dental",9.5f);


        listProduto.add(p1);
        listProduto.add(p2);
        listProduto.add(p3);
        listProduto.add(p4);

        Collections.sort(listProduto);

        System.out.println("A ordem dos produtos, levando o preço em conta É : ");
        for (Produto produto : listProduto) {
            System.out.println(produto);
        }

    }

}
