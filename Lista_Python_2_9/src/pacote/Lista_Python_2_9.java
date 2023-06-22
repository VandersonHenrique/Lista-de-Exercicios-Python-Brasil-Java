package pacote;

import java.util.Scanner;

public class Lista_Python_2_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("digite um número: ");
	    float n1 = teclado.nextFloat();
	    System.out.println("digite outro número: ");
	    float n2 = teclado.nextFloat();
	    System.out.println("digite outro número: ");
	    float n3 = teclado.nextFloat();
	    float menor;
	    float meio;
	    float maior;

	    if( n1<n2 && n1<n3){
	      menor = n1;
	    }
	    else if( n2<n1 && n2<n3){
	      menor = n2;
	    }
	    else{
	      menor = n3;
	    }
	    
	    if( n1>n2 && n1>n3 ){
	      maior = n1;
	    }
	    else if( n2>n1 && n2>n3 ){
	      maior = n2;
	    }
	    else{
	      maior = n3;
	    }

	    if( n1>n2 && n1<n3 || n1<n2 && n1>n3){
	      meio = n1;
	    }
	    else if(n2>n1 && n2<n3 || n2<n1 && n2>n3){
	      meio = n2;
	    }
	    else{
	      meio = n3;
	    }

	    System.out.print("a ordem decrescente é: " + maior + " " +  meio + " " + menor);
	    teclado.close();
	}

}
