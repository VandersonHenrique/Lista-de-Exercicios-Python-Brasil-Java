package pacote;

import java.util.Scanner;

public class Lista_Python_2_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Quanto você ganha por hora trabalhada: ");
	    double h = teclado.nextDouble();
	    System.out.print("Quantas horas você trabalha por mês: ");
	    double m = teclado.nextFloat();
	    double IR;
	    double inss = 0.10;
	    double fgts = 0.11;
	    double bruto = h*m;

	    if( bruto <= 900 ){
	      IR = 0;
	    }
	    else if( bruto > 900 && bruto <= 1500){
	      IR = 0.05;
	    }
	    else if( bruto > 1500 && bruto <=2500){
	      IR = 0.1;
	    }
	    else{
	      IR = 0.2;
	    }
	    
	    double IRv = bruto*IR;
	    double inssv = bruto*0.1;
	    double fgtsv = bruto*0.11;
	    double total = IRv+inssv;
	    double liquido = bruto-total;

	    System.out.println("Salário Bruto: (" + h + " * " + m + ")          : R$ " + bruto);
	    System.out.println("(-) IR (" + IR*100 + "%)                         : R$ " + IRv);
	    System.out.println("(-) INSS (" + inss*100 + "%)                        : R$ " + inssv);
	    System.out.println("FGTS (" + fgts + ")                           : R$ " + fgtsv);
	    System.out.println("Total de descontos                    : R$ " + total);
	    System.out.println("Salário Liquido                       : R$ " + liquido);
	    teclado.close();
	}

}
