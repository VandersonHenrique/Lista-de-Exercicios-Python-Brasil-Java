package pacote;
import java.util.Scanner;
public class Lista_Python_1_7 {

	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("digite o tamanho do lado do quadrado: ");
	    double lado = teclado.nextDouble();
	    System.out.println("a area do quadrado é: " + lado*lado + " e o dobro desta área é: " + lado*lado*2);
	    teclado.close();
	}

}
