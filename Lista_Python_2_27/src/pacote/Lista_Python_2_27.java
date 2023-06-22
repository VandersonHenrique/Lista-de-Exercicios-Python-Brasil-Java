package pacote;

import java.util.Scanner;

public class Lista_Python_2_27 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("informe a quantidade em kgs de maças compradas");
	    double macas = teclado.nextDouble();
	    System.out.println("informe a quantidade em kgs de morangos comprados");
	    double morangos = teclado.nextFloat();
	    double valorMorangos;
	    double valorMacas;
	    if (morangos <= 5){
	      valorMorangos = morangos * 2.5;
	      
	    }
	    else {
	      valorMorangos = morangos * 2.2;
	    }
	    if (macas <= 5){
	     valorMacas = macas * 1.8;
	    
	      }
	    else{
	    valorMacas = macas * 1.5;
	      }
	    double valorBruto = valorMorangos + valorMacas;
	    if ((morangos + macas) >= 8 || valorBruto >= 25){
	       double desconto = (valorBruto * 0.9);
	      double totalpagar = desconto;
	      System.out.printf("o total a se pagar é %.2f", totalpagar);
	      
	    }
	    
	    teclado.close();
	}

}
