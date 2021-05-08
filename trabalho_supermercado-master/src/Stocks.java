import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stocks {
    ArrayList<ProdGranel> produtosGranel;
    ArrayList<ProdEmbalado> produtosEmbalados;
    ArrayList<Cabazes> grupoCabazes;



    public ArrayList<ProdGranel> getProdutosGranel() {
        return produtosGranel;
    }

    public ArrayList<ProdEmbalado> getProdutosEmbalados() {
        return produtosEmbalados;
    }

    public ArrayList<Cabazes> getGrupoCabazes() {
        return grupoCabazes;
    }

    public void setProdutosGranel(ProdGranel prgranel) {
        produtosGranel.add(prgranel);
    }

    public void setProdutosEmbalados(ProdEmbalado prembalado) {
        produtosEmbalados.add(prembalado);
    }

    public void setGrupoCabazes(Cabazes cabaz) {
        grupoCabazes.add(cabaz);
    }

    public Stocks() {
        this.produtosGranel = new ArrayList<ProdGranel>();
        this.produtosEmbalados = new ArrayList<ProdEmbalado>();
        this.grupoCabazes = new ArrayList<Cabazes>();
    }
    public void inserirGranel(ProdGranel insereGranel){
        produtosGranel.add(insereGranel);
    }
    public void inserirEmbalado(ProdEmbalado insereEmbalado){
        produtosEmbalados.add(insereEmbalado);
    }
    public void inserirCabaz(Cabazes insereCabaz){
        grupoCabazes.add(insereCabaz);
    }
    public void listarProdGranel(){
        System.out.println("Listagem de todos os produtos granel existentes");
        Iterator<ProdGranel> it = produtosGranel.iterator();
        while(it.hasNext()){
            ProdGranel prodgra = it.next();
            System.out.println("Produto Granel: Referência "+ prodgra.getRef()+" Nome " + prodgra.getNome()+
                    " Preço " +prodgra.getPreco()+" cêntimos "+" Peso "+prodgra.getPeso()+"Quantidade "+prodgra.getQuantidade());
        }
    }
    public void listarCabazes(){
        System.out.println("Listagem de todos os cabazes existentes");
        Iterator<Cabazes> it = grupoCabazes.iterator();
        while(it.hasNext()){
            Cabazes cabaz = it.next();
            System.out.println("Produto Granel: Referência "+ cabaz.getRef()+" Nome " + cabaz.getNome()+
                    " Preço " +cabaz.getPreco()+" cêntimos "+" Desconto "+cabaz.getDesconto());
        }
    }
    public void aumentaGranel(String ref){
        boolean found = false;
        Iterator<ProdGranel> it = produtosGranel.iterator();
        while(!found && it.hasNext()){
            ProdGranel prodgra = it.next();
            if(prodgra.getRef().equals(ref)){
                found= true;
                int quantidade;
                Scanner scquantidade = new Scanner(System.in);
                System.out.println(("Introduza a quantidade que quer adicionar"));
                quantidade = scquantidade.nextInt();
                prodgra.quantidade+= quantidade;
                System.out.println("Produto alterado com sucesso");

            }
        }
    }
    public void listarProdEmbalado(){
        System.out.println("Listagem de todos os produtos granel existentes");
        Iterator<ProdEmbalado> it = produtosEmbalados.iterator();
        while(it.hasNext()){
            ProdEmbalado prodembala = it.next();
            System.out.println("Produto Granel: Referência "+ prodembala.getRef()+" Nome " + prodembala.getNome()+
                    " Preço " +prodembala.getPreco()+" cêntimos "+" Validade "+prodembala.getDatavalidade()+"Quantidade "+prodembala.getQuantidade());
        }
    }
    public void aumentaEmbalado(String ref){
        boolean found = false;
        Iterator<ProdEmbalado> it = produtosEmbalados.iterator();
        while(!found && it.hasNext()){
            ProdEmbalado prodembala = it.next();
            if(prodembala.getRef().equals(ref)){
                found= true;
                int quantidade;
                Scanner scquantidade = new Scanner(System.in);
                System.out.println(("Introduza a quantidade que quer adicionar"));
                quantidade = scquantidade.nextInt();
                prodembala.quantidade+= quantidade;
                System.out.println("Produto alterado com sucesso");

            }
        }
    }
}
