package pacote;

import java.util.Scanner;

public class Lista_Python_2_21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Informe o valor a ser sacado no caixa eletronico");
	    int valor = teclado.nextInt();

	  if (10>valor){
	   System.out.println("O valor a ser sacado é muito baixo para o caixa eletronico"); 
	  }
	   else if (valor>600) {
	     System.out.println("o valor a ser sacado é muito alto para este caixa eletronico"); 
	  }
	    else {
	     int notas100  =   ( valor  /  100 );
	     int notas50  =   (( valor  - ( notas100  *  100 )) /  50 );
	     int notas10  =   (( valor  - ( notas100  *  100 ) - ( notas50  *  50 )) /  10 );
	    int notas5  =   (( valor  - ( notas100  *  100 ) - ( notas50  *  50 ) - ( notas10  *  10 )) /  5 );
	    int notas1  =   ( valor  - ( notas100  *  100 ) - ( notas50  *  50 ) - ( notas10  *  10 ) - ( notas5  *  5 ));
	    
	    System.out.println("Para sacar a quantia de " + valor + " reais, o programa fornece " + notas100 + " notas de 100, " + notas50 + " notas de 50, " + notas5 + " notas de 5 e " + notas1 + " notas de 1 ");
	    }
	  teclado.close();
	}

}
