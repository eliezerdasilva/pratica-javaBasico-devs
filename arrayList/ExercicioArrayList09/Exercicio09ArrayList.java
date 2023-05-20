package ExercicioArrayList.ExercicioArrayList09;

import java.util.ArrayList;

/*
4. Crie uma lista de objetos da classe Aluno, com nome e nota, e calcule a média das
notas dos alunos.
 */
public class Exercicio09ArrayList {
    public static void main(String[] args) {


        ArrayList<Aluno> listAlunos = new ArrayList<>();


        var a1 = new Aluno("Eliézer", 8.5f);
        var a2 = new Aluno("Pedro", 9.5f);
        var a3 = new Aluno("Eduardo", 5.2f);
        var a4 = new Aluno("Maria Carol", 5.6f);
        var a5 = new Aluno("Carlos", 9f);

        listAlunos.add(a1);
        listAlunos.add(a2);
        listAlunos.add(a3);
        listAlunos.add(a4);
        listAlunos.add(a5);

        float media = 0;
        for (Aluno aluno : listAlunos){
            media += aluno.getNota();
        }
        System.out.println("A média dos alunos é de : "+media/listAlunos.size());


    }
}
