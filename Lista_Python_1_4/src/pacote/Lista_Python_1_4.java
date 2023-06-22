package pacote;

import java.util.Scanner;

public class Lista_Python_1_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite a nota do primeiro bimestre");
	    double n1 = teclado.nextDouble();
	    System.out.println("digite a nota do segundo bimestre");
	    double n2 = teclado.nextDouble();
	    System.out.println("digite a nota do terceiro bimestre");
	    double n3 = teclado.nextDouble();
	    System.out.println("digite a nota do quarto bimestre");
	    double n4 = teclado.nextDouble();
	    System.out.println("sua media é: " + (n1+n2+n3+n4)/4);
	    teclado.close();

	}

}
