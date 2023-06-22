package pacote;

import java.util.Scanner;

public class Lista_Python_2_20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite a primeira nota parcial: ");
	    float n1 = teclado.nextFloat();
	    System.out.println("Digite a segunda nota parcial: ");
	    float n2 = teclado.nextFloat();
	    System.out.println("Digite a terceira nota parcial: ");
	    float n3 = teclado.nextFloat();
	    float media = (n1+n2+n3)/3;

	    if(media<7){
	      System.out.println("Reprovado com média " + media);
	    }
	    else if(media==10){
	      System.out.println("Aprovado com distinçao com média " + media);
	    }
	    else if(media>=7){
	      System.out.println("Aprovado com média " + media);
	    }
	    
	    teclado.close();
	}

}
