package introducao;

public class conta {

	String Titular;
	String agencia;
	String numeroConta;
	double Saldo;
	
	public void depositar(double valor) {
		
		Saldo += valor;
		
	}
	
	public void Sacar (double valor) {
		
	Saldo -= valor;	
	}
	
	public void ImprimirSaldo () {
		
		System.out.println("seu saldo é " + Saldo);
	}
	}
