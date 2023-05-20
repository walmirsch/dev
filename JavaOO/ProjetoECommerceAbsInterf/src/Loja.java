
public class Loja {
public static void main(String[] args) {
	ICarrinho ic = new CarrinhoNormal();
	// mudar para
	// ICarrinho ic = new CarrinhoPromocional()
	// para ver o efeito da interface
	ic.adicionarProduto(new Produto(1, "Computador", 1500));
	ic.adicionarProduto(new Produto(2,"Monitor",1000));
	ic.adicionarProduto(new Produto(3,"Teclado",50));
	ic.adicionarProduto(new Produto(4,"Mouse",30));
	ic.totalizarPedido();
	System.out.println(ic);
} // main
} // Loja
