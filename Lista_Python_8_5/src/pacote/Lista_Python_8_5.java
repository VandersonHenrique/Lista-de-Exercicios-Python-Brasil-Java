package pacote;

public class Lista_Python_8_5 {

	public static void main(String[] args) {
		Conta j = new Conta(879, "Vanderson", 200.0f);
		System.out.println(j.toString());
		j.setNome("Fernando");
		j.deposito(50);
		System.out.println(j.toString());
		j.saque(110);
		System.out.println(j.toString());
	}

}
