package mvc;

public class endere�o extends cliente {
	

private int numero;
private String rua;
private String bairro;
private String cidade;
private String cep;
private String referencia;
private cliente cliente;
final private int fkCliente = cliente.getidCliente();


public int getfkCliente() {
	   
	   return fkCliente;
	   
}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}
public String getReferencia() {
	return referencia;
}
public void setReferencia(String referencia) {
	this.referencia = referencia;
}

}
