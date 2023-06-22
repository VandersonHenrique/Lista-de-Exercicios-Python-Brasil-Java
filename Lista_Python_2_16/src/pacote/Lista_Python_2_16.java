package pacote;

import java.util.Scanner;

public class Lista_Python_2_16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite o valor de a: ");
	    float a = teclado.nextFloat();
	    
	    if(a!=0){
	      System.out.print("Digite o valor de b: ");
	      float b = teclado.nextFloat();
	      System.out.print("Digite o valor de c: ");
	      float c = teclado.nextFloat();

	      float delta = (b*b)-4*a*c;

	      if(delta>0){
	        Double raiz = Math.sqrt(delta);
	        Double x1 = -b-raiz/2*a;
	        if(delta!=0){
	          Double x2 = -b+raiz/2*a;
	          System.out.println("A equação possui duas raizes reais: " + x1 + " e " + x2);
	        }
	        else{
	          System.out.println("A equação possuui apenas uma raiz real: " + x1);
	        }
	      }
	      else{
	        System.out.println("A equação não possui raizes reais!");
	      }
	    }
	    else{
	      System.out.println("A equação não é de segundo grau!");
	    }
	    teclado.close();
	}

}
