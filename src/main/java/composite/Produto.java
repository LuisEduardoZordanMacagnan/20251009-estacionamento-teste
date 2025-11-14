package composite;

public class Produto implements ItemCardapio{
    private String nome;
    private double preco;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void exibir() {
        System.out.println(nome+" "+preco);
    }
}
