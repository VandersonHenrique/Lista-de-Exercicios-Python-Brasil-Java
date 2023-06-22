package pacote;

public class Lista_Python_8_14 {

	public static void main(String[] args) {
		Funcionario Func = new Funcionario("Vanderson", 1200);
		System.out.println("Nome: " + Func.getNome() + ", Salário: " +
		Func.getSalario());
		Func.aumentarSalario(10);
		System.out.println("Nome: " + Func.getNome() + ", Salário: " +
		Func.getSalario());
	}

}
