package pacote;

import java.util.Scanner;

public class Lista_Python_2_23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	     System.out.println("informe um numero");
	      double numero = teclado.nextDouble();
	      double arredondar = Math.ceil(numero);

	    if (  numero == arredondar )  {
	      System.out.println("O numero informado é inteiro");
	    }
	    else {
	      System.out.println("O numero informado é decimal");
	    }
	    teclado.close();
	}

}
