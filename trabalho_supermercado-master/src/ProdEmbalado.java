public class ProdEmbalado extends Produto{
    private String Datavalidade;;

    public ProdEmbalado(String nome, Float preco, String ref, String datavalidade,int quantidade)
    {
        super(nome, preco, ref);
        this.Datavalidade = datavalidade;
        this.quantidade=quantidade;
    }


    public String getDatavalidade() {
        return Datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        Datavalidade = datavalidade;
    }
}
