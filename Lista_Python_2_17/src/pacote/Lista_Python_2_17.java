package pacote;

import java.util.Scanner;

public class Lista_Python_2_17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite o ano: ");
	    float ano = teclado.nextFloat();
	    if((ano%400==0) || ano%4==0 && ano%100!=0){
	      System.out.println(ano +" é um ano bisexto!");
	    }
	    else{
	      System.out.println(ano + " não é um ano bisexto!");
	    }
	    teclado.close();
	}

}
