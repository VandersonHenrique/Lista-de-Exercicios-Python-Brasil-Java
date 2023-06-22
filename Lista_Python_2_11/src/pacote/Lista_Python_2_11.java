package pacote;

import java.util.Scanner;

public class Lista_Python_2_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Inseira o salário: ");
	    double s = teclado.nextDouble();
	    double porcento;
	    double aumento;
	    double sd;
	    
	    if( s <= 280){
	      porcento = 0.2;
	    }
	    else if( s > 280 && s <= 700){
	      porcento = 0.15;
	    }
	    else if ( s > 700 && s <= 1500){
	      porcento = 0.1;
	    }
	    else{
	      porcento = 0.05;
	    }
	    
	    aumento = s*porcento;
	    sd = s+aumento;
	    
	    System.out.println("Salário antes do aumento: " + s);
	    System.out.println("Percentual de aumento aplicado: é " + porcento*100 + "% " );
	    System.out.println("Valor do aumento: " + aumento);
	    System.out.println("Salário após o aumento: " + sd);
	    teclado.close();
	}

}
