package pacote;

public class Lista_Python_8_16 {

	public static void main(String[] args) {
		Bichinho b = new Bichinho("Pkémon", 6, 7, 8);
		System.out.println(b.humor());
		b.alimenta(30);
		System.out.println(b.humor());
		b.brincar(20);
		System.out.println(b.humor());
		System.out.println(b.str());
	}

}
