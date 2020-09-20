package mvc;

import java.sql.Date;

public class Main {
	cliente c1;
	
	
	public static void main(String args[]) {}
	
	
	
	
	
	public void CriaCliente(int id, String nome, String cpf, String RG, String Email, Date nascimento)
	{
		c1.setid(id);
		c1.setName(nome);
		c1.setCpf(cpf);
		c1.setRg(RG);
		c1.setEmail(Email);
		c1.setNascimento(nascimento);
	}
}
