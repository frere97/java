package jogo;

public class metralhadora implements arma {

	int municaoMax = 30;
	int municao = municaoMax;
	float tempoRecarregar = 2f;
	
	@Override
	public void atirar() {
		if (municao > 0) {
			System.out.println("pew");
			municao --;
			System.out.println ("estou com " + municao + " balas");
		}
		else {recarregar();}
	}

	@Override
	public void recarregar() {
		System.out.println("recarregando por " + tempoRecarregar);
		municao = municaoMax;
	}

}
