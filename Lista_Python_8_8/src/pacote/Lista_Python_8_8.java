package pacote;

public class Lista_Python_8_8 {

	public static void main(String[] args) {
		Macaco m1 = new Macaco("Macaco 1");
		Macaco m2 = new Macaco("Macaco 1");
		m1.comer("Maçã");
		m1.verBucho();
		m1.comer("Banana");
		m1.verBucho();
		m1.comer("Abacaxi");
		m1.verBucho();
		m1.digerir();
		m1.verBucho();
		m2.comer("Maça");
		m2.comer("Banana");
		m2.comer(m1);
		m2.verBucho();
	}

}
