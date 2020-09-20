package introducao;

public class contaCorrente extends conta {
	double chequeEspecial;
	double pacoteDeServicos;
	
	public contaCorrente() {
		super();
	}
	
	public void viraMes() {
		Saldo -= this.pacoteDeServicos;
		
	}
}
