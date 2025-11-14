package composite;

import java.util.ArrayList;

public class Combo implements ItemCardapio{
    private String nome;
    private ArrayList<ItemCardapio> itens = new ArrayList<>();

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for(ItemCardapio item : itens){
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public void exibir() {
        System.out.println(nome+" "+getPreco());
    }

    public void adicionar(ItemCardapio item){
        itens.add(item);
    }

    public void remover(ItemCardapio item){
        itens.remove(item);
    }
}
