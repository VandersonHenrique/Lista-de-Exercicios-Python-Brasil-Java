package pacote;
import java.util.Scanner;
public class Lista_Python_1_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite a temperatura em Fahrenheit: ");
	    double f = teclado.nextDouble();
	    System.out.println("a temperatura em celsius é: " + 5*((f-32)/9));
	    teclado.close();
	}

}
