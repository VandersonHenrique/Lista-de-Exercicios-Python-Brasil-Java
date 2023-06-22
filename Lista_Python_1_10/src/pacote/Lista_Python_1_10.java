package pacote;
import java.util.Scanner;
public class Lista_Python_1_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite a temperatura em celsius: ");
	    double c = teclado.nextDouble();
	    double f = (c*9/5)+32;
	    System.out.println("a temperatura em Fahrenheit è: " + f);
	    teclado.close();
	}

}
