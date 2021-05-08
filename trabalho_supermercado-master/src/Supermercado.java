import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class Supermercado {

private static char escolha;
private static char tipo;

    public static void main(String[] args) {
        Scanner scMenu = new Scanner(System.in);
        Scanner scTipo = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int invalido;
        Stocks stock= new Stocks();
        do {
            do {
                invalido = 0;
                System.out.println("\nSuperMercado ");
                System.out.println("Gestão de vendas:");
                System.out.println("a - adiciona stock");
                System.out.println("v - processar uma venda");
                System.out.println("g - novo produto a granel");
                System.out.println("e - novo produto embalado");
                System.out.println("c - novo cabaz");
                System.out.println("s - Sair");
                System.out.println("\nEscolha uma opção ");
                escolha = scMenu.next().charAt(0);
                escolha = Character.toLowerCase(escolha);
            }while(!(escolha =='a'|| escolha =='v'|| escolha =='g' || escolha =='e' || escolha =='c' || escolha =='s'));
            switch (escolha){
                    case 'a':
                        System.out.println("Adicione stock a um produto");
                        do {
                            System.out.println("Que tipo de produto quer atualizar(Granel(G) ou Embalado(E))");
                            tipo=scTipo.next().charAt(0);
                            tipo=Character.toLowerCase(tipo);
                        }while(!(tipo=='g' || tipo=='e'));
                        switch (tipo) {
                            case 'g':
                                System.out.println("Adicione Stock a produto a granel");
                                stock.listarProdGranel();
                                if (stock.produtosGranel.isEmpty()) {
                                    System.out.println("Não existe nenhum produto  granel em stock");
                                } else {
                                    System.out.println(("Referência"));
                                    Scanner referenciaGranel = new Scanner(System.in);
                                    String referencia;
                                    referencia = referenciaGranel.nextLine();
                                    stock.aumentaGranel(referencia);
                                    stock.listarProdGranel();
                                }
                            case 'e':
                                System.out.println("Adicione Stock a produto embalado");
                                stock.listarProdEmbalado();
                                if (stock.produtosEmbalados.isEmpty()) {
                                    System.out.println("Não existe nenhum produto  embalado em stock");
                                } else {
                                    System.out.println(("Referência"));
                                    Scanner referenciaEmbala = new Scanner(System.in);
                                    String referencia;
                                    referencia = referenciaEmbala.nextLine();
                                    stock.aumentaEmbalado(referencia);
                                    stock.listarProdEmbalado();
                                }
                                break;
                        }
                        break;
                            case 'v':
                                System.out.println("Lista de todos os produtos existentes");
                                stock.listarProdGranel();
                                stock.listarProdEmbalado();
                                do {
                                    System.out.println("Que produto deseja adicionar('S' para terminar a insersao de produtos) ");
                                }while (tipo != 's');
                                break;
                            case 'g':

                                System.out.println("Insira a referência do produto");
                                String refg = sc.next();
                                System.out.println("Insira o nome do produto");
                                String nomeg = sc.next();
                                System.out.println("Insira o preço do produto");
                                float precog = sc.nextFloat();
                                System.out.println("Insira o peso do produto");
                                Float pesog = sc.nextFloat();
                                System.out.println("Insira a quantidade do produto");
                                Integer quantidadeg = sc.nextInt();
                                ProdGranel prodgr1 = new ProdGranel(nomeg,precog,refg,pesog,quantidadeg);
                                System.out.println("Produto Granel: Referência "+ prodgr1.getRef()+" Nome " + prodgr1.getNome()+
                                        " Preço " +prodgr1.getPreco()+" cêntimos "+" Peso "+prodgr1.getPeso()+" Quantidade " + prodgr1.getQuantidade() +"foi adicionado com sucesso");
                                stock.inserirGranel(prodgr1);
                                break;
                    case 'e':
                        System.out.println("Insira a referência do produto");
                        String refe = sc.next();
                        System.out.println("Insira o nome do produto");
                        String nomee = sc.next();
                        System.out.println("Insira o preço do produto");
                        float precoe = sc.nextFloat();
                        System.out.println("Insira a data de validade do produto");
                        String  dataValidadee= sc.next();
                        System.out.println("Insira a quantidade do produto");
                        Integer  quantidadee= sc.nextInt();
                        ProdEmbalado prodemb1 = new ProdEmbalado(nomee,precoe,refe,dataValidadee,quantidadee);
                        System.out.println("Produto Embalado: Referência "+ prodemb1.getRef()+" Nome " + prodemb1.getNome()+
                                " Preço " +prodemb1.getPreco()+" cêntimos "+" Data de validade "+prodemb1.getDatavalidade()+" Quantidade " +prodemb1.getQuantidade() +" foi adicionado com sucesso");
                        stock.inserirEmbalado(prodemb1);
                        break;
                    case 'c':
System.out.println("Quais os produtos disponiveis para adicionar ao cabaz");
stock.listarProdEmbalado();
stock.listarProdGranel();
                        System.out.println("Insira a referência do produto");
                        String refc = sc.next();
                        System.out.println("Insira o nome do produto");
                        String nomec = sc.next();
                        System.out.println("Insira o desconto do produto");
                        Integer descontoc = sc.nextInt();
                        System.out.println("Insira a quantidade do produto");
                        float precoc= sc.nextInt();
                        break;
                    case 's':
                        return;
                    default:
                        System.out.println(("Escolha Inválida"));
                }


            }while (!(escolha == 's'));
        }
}