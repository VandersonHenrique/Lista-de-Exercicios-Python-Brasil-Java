package pacote;

public class Lista_Python_8_9 {

	public static void main(String[] args) {
		Ponto p1 = new Ponto(10,20);
		Ponto p2 = new Ponto(20,50);
		Retangulo retangulo = new Retangulo(p1,p2);
		System.out.println(retangulo.centro());

	}

}
