package pacote;

import java.util.Scanner;

public class Lista_Python_2_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Digite a primeira nota: ");
	    Float n1 = teclado.nextFloat();
	    System.out.println("Digite a segunda nota: ");
	    Float n2 = teclado.nextFloat();
	    float media = (n1+n2)/2;
	    if(media==10){
	      System.out.println("Aprovado com Distinção");
	    }
	    else if(media>=7){
	      System.out.println("Aprovado");
	    }
	    else{
	      System.out.println("Reprovado");
	    }
	    teclado.close();
	}

}
