import java.util.ArrayList;

public class Cabazes extends Produto{
    private Integer desconto;
    ArrayList<Produto> produtos;

    public Cabazes(String nome, Float preco, String ref, Integer desconto,ArrayList<Produto> produto)
    {
        super(nome, preco, ref);
        this.produtos=produto;
        this.quantidade=0;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
