public class Produto {
    private String nome;
    private Float preco;
    private String ref;
    protected  int quantidade;

    public String getNome() {
        return nome;
    }

    public Float getPreco() {
        return preco;
    }

    public String getRef() {
        return ref;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto(String nome, Float preco, String ref){
        this.nome = nome;
        this.preco = preco;
        this.ref = ref;
    }

    public void aumentaQuant(int quantidade) {
        this.quantidade += quantidade;
    }
}
