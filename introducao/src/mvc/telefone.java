package mvc;

public class telefone extends cliente{


	int ddd;
   int numero;
   private cliente cliente;
   final private int fkCliente = cliente.getidCliente();
   
public int getfkCliente() {	   
return fkCliente;
}
public int getDdd() {
	return ddd;
}
public void setDdd(int ddd) {
	this.ddd = ddd;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

}
