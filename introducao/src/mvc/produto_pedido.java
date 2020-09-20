package mvc;

public class produto_pedido {
	
	private produto produto;
	private pedido pedido;
	private int fkPedido = pedido.getNotaFiscal();
	private int fkProduto = produto.getIdProduto();
	
	
	public int getFkPedido() {
		return fkPedido;
	}
	

	
	public int getFkProduto() {
		return fkProduto;
	}
	

	
	public produto getProduto() {
		return produto;
	}
	
	public void setProduto(produto produto) {
		this.produto = produto;
	}
	
	public pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}

	
	
	

}
