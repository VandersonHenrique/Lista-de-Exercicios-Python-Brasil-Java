package pacote;

import java.util.Scanner;

public class Lista_Python_2_14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	      
	    System.out.print("Digite a primeira nota: ");
	    float n1 = teclado.nextFloat();
	    System.out.print("Digite a segunda nota:");
	    float n2 = teclado.nextFloat();
	    float media = (n1+n2)/2;

	    System.out.println("");
	    
	    if( media >= 9 ){
	      System.out.println(" Nota 1 = " + n1 + " Nota 2 = " + n2 + " Média = " + media + " Conceito = A (aprovado)");
	    }
	    else if( media < 9 && media >= 7.5 ){
	      System.out.println(" Nota 1 = " + n1 + " Nota 2 = " + n2 + " Média = " + media + " Conceito  B  (aprovado)");
	    }
	    else if( media < 7.5 && media >= 6 ){
	      System.out.println(" Nota 1 = " + n1 + " Nota 2 = " + n2 + " Média = " + media + " Conceito = C  (aprovado)");
	    }
	    else if( media < 6 && media >= 4){
	      System.out.println(" Nota 1 = " + n1 + " Nota 2 = " + n2 + " Média = " + media + " Conceito = D  (reprovado)");
	    }
	    else{
	      System.out.println(" Nota 1 = " + n1 + " Nota 2 = " + n2 + " Média = " + media + "  Conceito = E  (reprovado)");
	    }
	    teclado.close();
	}

}
