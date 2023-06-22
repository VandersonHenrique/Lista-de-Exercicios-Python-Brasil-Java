package pacote;

import java.util.Scanner;

public class Lista_Python_2_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    float n1 = teclado.nextFloat();
	    if(n1>=0){
	      System.out.print(n1 + " é positivo!");
	    }
	    else{
	      System.out.print(n1 + " é negativo!");
	    }
	    teclado.close();
	}

}
