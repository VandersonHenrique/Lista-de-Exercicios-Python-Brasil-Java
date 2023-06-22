package pacote;

import java.util.Scanner;

public class Lista_Python_2_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("digite qual é o dia da semana (1)-Domingo (2)-Segunda (3)-Terça (4)-Quarta (5)-Quinta (6)-Sexta (7)-Sábado?: ");
	    float dia = teclado.nextFloat();

	    if( dia == 1){
	      System.out.print("Hoje é Domingo!");
	    }
	    else if( dia == 2){
	      System.out.print("Hoje é segunda-feira!");
	    }
	    else if ( dia == 3){
	      System.out.print("Hoje é terça-feira!");
	    }
	    else if( dia == 4){
	      System.out.print("Hoje é quarta-feira!");
	    }
	    else if( dia == 5){
	      System.out.print("Hoje é quinta-feira!");
	    }
	    else if( dia == 6){
	      System.out.print("Hoje é sexta-feira!");
	    }
	    else if( dia == 7){
	      System.out.print("Hoje é sábado!");
	    }
	    else{
	      System.out.print("Valor inválido!");
	    }
	    teclado.close();
	}

}
