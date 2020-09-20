package animais;

public class cachorro implements animal {



	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	@Override
	public void respirar() {
		System.out.println("respirando Oxigenio");
		
		
	}

	@Override
	public void mover() {
		System.out.println("andando");
	}

	@Override
	public void comer() {
		System.out.println("comendo ração");
		
	}

}
