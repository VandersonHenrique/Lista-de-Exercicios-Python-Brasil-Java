package pacote;

import java.util.Scanner;

public class Lista_Python_2_8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("digite o preço do primeiro produto: ");
	    float n1 = teclado.nextFloat();
	    System.out.println("digite o preço do segundo produto: ");
	    float n2 = teclado.nextFloat();
	    System.out.println("digite o preço do terceiro produto: ");
	    float n3 = teclado.nextFloat();

	    if( n1<n2 && n1<n3){
	      System.out.print("O produto mais barato é: " + n1);
	    }
	    else if( n2<n1 && n2<n3){
	    System.out.print("O produto mais barato é: " + n2);
	    }
	    else{
	      System.out.print("O produto mais barato é: " + n3);
	    }
	    
	    teclado.close();
	}

}
