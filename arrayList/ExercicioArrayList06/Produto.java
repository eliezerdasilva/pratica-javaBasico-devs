package ExercicioArrayList.ExercicioArrayList06;

public class Produto implements Comparable<Produto>  {

    private String nome;
    private float preco;

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto produto) {
        return Float.compare(this.preco, produto.getPreco());
    }

    @Override
    public String toString() {
        return "Produto : " + " nome = " + nome +  ", preco = " + preco ;
    }
}
