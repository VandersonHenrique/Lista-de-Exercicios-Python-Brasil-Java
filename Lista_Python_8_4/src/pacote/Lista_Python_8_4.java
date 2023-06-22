package pacote;

public class Lista_Python_8_4 {

	public static void main(String[] args) {
		Pessoa a = new Pessoa("Amanda", 18, 75, 180);
		System.out.println(a.toString());
		a.engordar(5);
		System.out.println(a.toString());
		a.emagrecer(10);
		System.out.println(a.toString());
		a.crescer(3);
		System.out.println(a.toString());
		a.envelhecer(1);
		System.out.println(a.toString());
	}

}
