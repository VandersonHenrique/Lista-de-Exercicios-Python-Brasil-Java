package pacote;

import java.util.Scanner;

public class Lista_Python_2_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite o primeiro número: ");
	    float n1 = teclado.nextFloat();
	    System.out.println("digite o segundo número: ");
	    float n2 = teclado.nextFloat();
	    System.out.println("digite o terceiro número: ");
	    float n3 = teclado.nextFloat();
	    if( n1>n2 && n1>n3 ){
	     System.out.println("o maior número digitado foi: " + n1);
	    }
	    else if( n2>n1 && n2>n3 ){
	      System.out.println("o maior número digitado foi: " + n2);
	    }
	    else{
	      System.out.println("o maior número digitado foi: " + n3);
	    }
	    teclado.close();
	}

}
