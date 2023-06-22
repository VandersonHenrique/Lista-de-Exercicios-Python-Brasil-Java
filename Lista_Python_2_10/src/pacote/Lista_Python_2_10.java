package pacote;

import java.util.Scanner;

public class Lista_Python_2_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Em que turno você estuda (M)matutino (V)vespertino (N)noturno ");
	    char turno = teclado.next().charAt(0);;

	    if(turno == 'M' || turno == 'm'){
	      System.out.println("Bom Dia");
	    }
	    else if(turno == 'V' || turno == 'v'){
	      System.out.println("Boa Tarde");
	    }
	    else if(turno == 'N' || turno == 'n'){
	      System.out.println("Boa Noite");
	    }
	    else{
	      System.out.println("Valor Inválido");
	    }
	    teclado.close();
	}

}
