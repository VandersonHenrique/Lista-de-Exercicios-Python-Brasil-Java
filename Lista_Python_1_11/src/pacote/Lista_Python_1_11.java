package pacote;
import java.util.Scanner;
public class Lista_Python_1_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite um número inteiro: ");
	    int n1 = teclado.nextInt();
	    System.out.println("digite um número inteiro: ");
	    int n2 = teclado.nextInt();
	    System.out.println("digite um número real: ");
	    double n3 = teclado.nextDouble();
	    double A = n1*2*(n2/2);
	    System.out.println("O produto do dobro do primeiro com metade do segundo " + A);
	    double B = n1*3+n3;
	    System.out.println("A soma do triplo do primeiro com o terceiro " + B);
	    double C = n3*n3*n3;
	    System.out.println("O terceiro elevado ao cubo " + C);
	    teclado.close();
	}

}
