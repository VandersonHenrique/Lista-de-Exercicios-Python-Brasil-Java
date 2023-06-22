package pacote;

import java.util.Scanner;

public class Lista_Python_2_26 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Informe (A) para alcool ou (G) para gasolina");
	    char combustivel = teclado.next().charAt(0);
	      System.out.println("Infome a quantidade de litros");
	    double litros = teclado.nextDouble();
	    if (combustivel == 'A' || combustivel== 'a'){
	      double valor = 1.9;
	      if (litros <= 20){
	        double desconto = 3;
	        double totalpagar = ((valor*litros ) * ((100-desconto) /  100 ));
	    System.out.printf("o total a se pagar %.2f R$", totalpagar);
	      }
	      else{
	        double desconto = 5;
	        double totalpagar = ((valor*litros ) * ((100-desconto) /  100 ));
	    System.out.printf("o total a se pagar é %.2f R$", totalpagar);
	        
	      }
	      
	    }
	    else if (combustivel == 'G' || combustivel== 'g'){
	      double valor = 2.5;
	        if(litros <= 20){
	       double desconto = 4;
	          double totalpagar = ((valor*litros ) * ((100-desconto) /  100 ));
	    System.out.printf("o total a se pagar é %.2f R$", totalpagar);
	          
	        }
	      else{
	        double desconto = 6;
	          double totalpagar = ((valor*litros ) * ((100-desconto) /  100 ));
	    System.out.printf("o total a se pagar é %.2f R$", totalpagar);
	      }
	    }
	    else{
	      System.out.printf("Combustivel invalido");
	    }
	    
	    teclado.close();
	}

}
