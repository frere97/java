package br.com.dh.lojaonline.model.entities;

public class Produto {
	
	private int idProduto;
	private String nomeProduto;
	private String preco;

	public Produto(int idProduto, String NomeProduto, String preco) {
		this.idProduto = idProduto;
		this.nomeProduto = NomeProduto;
		this.preco = preco;
	}
	
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	}