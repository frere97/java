package mvc;

import java.sql.Date;

public class pedido extends cliente {

	private int idProduto;
	private int notaFiscal;
	private Date dataSolicitacao;
	private Double valorTotal;
	private String situacao;
	
	public int getIdProduto() {
		return idProduto;
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}
	
	private void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	
	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}
	
	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	
	public Double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
}
