package animais;

public class passaro implements animal {

	@Override
	public void respirar() {
		System.out.println("respirando Oxigenio");

	}

	@Override
	public void mover() {
		System.out.println("andando ou voando");
		
	}

	@Override
	public void comer() {
		System.out.println("comendo minhocas");
		
	}

}
