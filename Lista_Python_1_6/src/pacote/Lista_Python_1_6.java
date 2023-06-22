package pacote;

import java.util.Scanner;

public class Lista_Python_1_6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	      double d, r, a ;
	      System.out.println("digite o diametro do circulo ");
	      d = teclado.nextDouble();
	      System.out.println("o raio do seu circulo é");
	      r = d/2;
	      System.out.println(r);
	      System.out.println("a area do seu circulo é");
	      a = Math.PI* (r * r) ;
	      System.out.println(a);
	      
	      
	      teclado.close();
	}

}
