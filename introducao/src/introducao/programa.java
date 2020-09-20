package introducao;

public class programa {
public static void main(String[] args) {
	conta contaTeste = new conta();
	contaCorrente ccTeste = new contaCorrente();
	Poupanca poupanca = new Poupanca();

poupanca.rendimento = 0.01;
poupanca.depositar(200);
poupanca.viraMes();
poupanca.ImprimirSaldo();

 }
}
