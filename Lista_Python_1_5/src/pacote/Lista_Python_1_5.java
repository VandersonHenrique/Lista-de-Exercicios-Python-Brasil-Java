package pacote;

import java.util.Scanner;

public class Lista_Python_1_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite o numero em metros: ");
	    double metro = teclado.nextDouble();
	    if (metro == 1)
	    {
	      System.out.println(metro + " metro são " + metro*100 + " centimetros");
	    }
	    else{
	      System.out.println(metro + " metros são " + metro*100 + " centimetros");
	    }
	    teclado.close();

	}

}
