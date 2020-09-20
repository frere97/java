package jogo;

public class shotgun implements arma {

	int municaoMax = 6;
	int municao = municaoMax;
	float tempoRecarregar = 4.3f;
	
	@Override
	public void atirar() {
		if (municao > 0) {
			System.out.println("pow pow");
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
