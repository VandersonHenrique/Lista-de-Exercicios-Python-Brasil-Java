package pacote;

public class Lista_Python_8_12 {

	public static void main(String[] args) {
		ContaInvestimentos poupanca = new ContaInvestimentos(123, "Jose", 1000, 10);
		System.out.println(poupanca.toString());
		poupanca.adicioneJuros();
		poupanca.adicioneJuros();
		poupanca.adicioneJuros();
		poupanca.adicioneJuros();
		poupanca.adicioneJuros();
		System.out.println(poupanca.toString());
	}

}
