package pacote;

import java.util.Scanner;

public class Lista_Python_2_22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		  System.out.println("Informe um numero inteiro:");
		    int numero = teclado.nextInt();

		    if (numero % 2 == 0){
		      System.out.println("O numero informado é par");
		    }

		    else {
		      System.out.println("O numero informado é impar");
		    }
		    
		    teclado.close();
	}

}
