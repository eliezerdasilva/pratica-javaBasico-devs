package ExercicioList;

/*
5. Crie um array com 4 números reais e calcule a soma de todos os elementos.
 */
public class Exercicio05Array {
    public static void main(String[] args) {
        double array[]= new double[3];
        array = new double[]{Math.PI,Math.sqrt(2),Math.acos(0.5),Math.cbrt(2)};
        double soma = 0;
        for(int i = 0; i<array.length;i++){
            soma+= array[i];
        }
        System.out.println("A soma dos números é :"+soma/ array.length);
    }
}
