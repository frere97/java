package introducao;

public class Poupanca extends conta {
double rendimento;

public Poupanca() {super();}

public void viraMes() {
	Saldo += (Saldo * rendimento);
}

}
