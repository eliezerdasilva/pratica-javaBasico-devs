package ExercicioList;

/*
    4. Crie um array com 6 números inteiros e calcule a média aritmética de todos os
elementos.
 */
public class Exercicio04Array {
    public static void main(String[] args) {

        int array[]= new int[5];
        array = new int[]{10, 5, 5, 5, 6, 5};
        int soma = 0;
        for(int i = 0; i<array.length;i++){
            soma+= array[i];
        }
        System.out.println("A soma dos números é :"+soma/ array.length);

    }
}
