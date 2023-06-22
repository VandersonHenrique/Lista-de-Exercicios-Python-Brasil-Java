package pacote;
import java.util.Scanner;
public class Lista_Python_1_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Quanto você ganha por hora trabalhada? ");
	    double hora = teclado.nextDouble();
	    System.out.println("Quantas horas você trabalha por mês? ");
	    double mes = teclado.nextDouble();
	    double total = hora*mes;
	    double imposto = total*11/100;
	    double inss = total*8/100;
	    double sindicato = total*5/100;
	    double liquido = total-imposto-inss-sindicato;
	    System.out.println("Seu salario bruto é " + total + " R$, paga " + inss + " R$ ao inss, " + imposto + " R$ de imposto e " + sindicato + " R$ para o sindicato.");
	    System.out.println("seu salario liquido é " + liquido + " R$");
	    teclado.close();
	}

}
