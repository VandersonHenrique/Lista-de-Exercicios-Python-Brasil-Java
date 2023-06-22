package pacote;

import java.util.Scanner;

public class Lista_Python_2_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("digite o primeiro lado do triangulo: ");
	    float n1 = teclado.nextFloat();
	    System.out.print("digite o segundo lado do triangulo: ");
	    float n2 = teclado.nextFloat();
	    System.out.print("digite o terceiro lado do triangulo: ");
	    float n3 = teclado.nextFloat();
	    
	    if(n1<n2+n3 && n2<n1+n3 && n3<n1+n2){
	      System.out.print("É um triangulo");  
	          if(n1==n2 && n1==n3){
	      System.out.println(" equilátero");
	    }
	    else if( n1==n2 || n1==n3 || n2==n3 ){
	      System.out.println(" isóceles");
	    }
	    else if(n1!=n2 && n1!=n3 && n2!=n3){
	      System.out.println(" escaleno");
	    }
	    }
	    else{
	      System.out.println("Não é um triangulo!");
	    }
	    teclado.close();
	}

}
