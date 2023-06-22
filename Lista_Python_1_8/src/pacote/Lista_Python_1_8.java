package pacote;
import java.util.Scanner;
public class Lista_Python_1_8 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("quanto você ganha por hora? ");
	    double hora = teclado.nextDouble();
	    System.out.println("quantas horas por mês você trabalha? ");
	    double mes = teclado.nextDouble();
	    System.out.println("você ganha por mês " + hora*mes + " R$");
	    teclado.close();
	}

}
