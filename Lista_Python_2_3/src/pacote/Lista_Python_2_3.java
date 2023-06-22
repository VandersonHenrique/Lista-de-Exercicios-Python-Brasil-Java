package pacote;

import java.util.Scanner;

public class Lista_Python_2_3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("imforme seu sexo (F)feminino ou (M)masculino: ");
	    char sexo = teclado.next().charAt(0);;
	    if(sexo=='F'|| sexo=='f'){
	      System.out.print("você digitou feminino!");
	    }
	    else if(sexo=='M'||sexo=='m'){
	      System.out.print("você digitou masculino!");
	    }
	    else{
	      System.out.print("Sexo Inválido.");
	    }
	    teclado.close();
	}

}
