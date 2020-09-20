package animais;

public class Programa {
public static void main(String[] src) {
	cachorro c1 = new cachorro();
	passaro p1 = new passaro();
	c1.setName("Nick");
	c1.comer();
	c1.mover();
	c1.respirar();
	p1.comer();
	p1.mover();
	p1.respirar();
}
}
