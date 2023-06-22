package pacote;

import java.util.Scanner;

public class Lista_Python_1_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	      System.out.println("digite o primeiro número: ");
	      int n1 = teclado.nextInt();
	      System.out.println("digite o segundo número: ");
	      int n2 = teclado.nextInt();
	      System.out.println("a soma dos numeros informados é: ");
	      System.out.println(n1+n2);
	      teclado.close();
	}

}
