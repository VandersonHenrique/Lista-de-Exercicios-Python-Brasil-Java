package pacote;

import java.util.Scanner;

public class Lista_Python_8_3 {

	public static void main(String[] args) {
		float comprimento, largura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do comprimento: ");
		comprimento = teclado.nextFloat();
		System.out.println("Informe o valor da largura: ");
		largura = teclado.nextFloat();
		Retangulo retangulo = new Retangulo(comprimento,largura);
		System.out.println("A área é: " + retangulo.area());
		System.out.println("O perimetro é: " + retangulo.perimetro());
		teclado.close();
	}

}
