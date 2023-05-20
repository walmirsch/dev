
public class Pedido {
	private int numero;
	private String data;
	private double total;
	private Cliente cliente;
	private Produto produto;
	public Pedido(int numero, String data, double total, Cliente cliente, Produto produto) {
		super();
		this.numero = numero;
		this.data = data;
		this.total = total;
		this.cliente = cliente;
		this.produto = produto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public String exibir() {	
		return "Pedido #" + numero + " Data:" + data + String.format("  R$ %.2f\n", total) 
				+ cliente.getNome() + " (" + cliente.getCpf() + ")\n" + "Produto:" + produto.getNome()
				+ String.format("  R$ %.2f", produto.getPreco());
	} // exibir
} // Pedido
