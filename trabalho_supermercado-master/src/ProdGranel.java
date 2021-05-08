public class ProdGranel extends Produto {
    private Float peso;


    public ProdGranel(String nome, Float preco, String ref, Float peso, int quantidade) {
        super(nome, preco, ref);
        this.peso = peso;
        this.quantidade = quantidade;
    }


    public Float getPeso() {
        return peso;
    }

    public Float getPrecofinal() {
        return peso;
    }
}

