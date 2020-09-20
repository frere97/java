package mvc;

import java.sql.Date;

public class cliente {

private int idCliente;
private String name;
private String cpf;
private String rg;
private String email;
private Date nascimento;


public int getidCliente() {
	return idCliente;
}

public void setid(int id) {
	this.idCliente = id;
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getNascimento() {
	return nascimento;
}
public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
}



}
