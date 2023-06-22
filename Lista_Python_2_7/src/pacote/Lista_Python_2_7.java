package pacote;

import java.util.Scanner;

public class Lista_Python_2_7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("digite o primeiro número: ");
	    float n1 = teclado.nextFloat();
	    System.out.println("digite o segundo número: ");
	    float n2 = teclado.nextFloat();
	    System.out.println("digite o terceiro número: ");
	    float n3 = teclado.nextFloat();
	    float maior ;
	    float menor ;
	      
	    if( n1>n2 && n1>n3 ){
	      maior = n1;
	    }
	    else if( n2>n1 && n2>n3 ){
	      maior = n2;
	    }
	    else{
	      maior = n3;
	    }

	    if( n1<n2 && n1<n3){
	      menor = n1;
	    }
	    else if( n2<n1 && n2<n3){
	      menor = n2;
	    }
	    else{
	      menor = n3;
	    }
	    
	    System.out.println("o maior número digitado foi: " + maior + " e o menor número foi: " + menor);
	    teclado.close();
	}

}
