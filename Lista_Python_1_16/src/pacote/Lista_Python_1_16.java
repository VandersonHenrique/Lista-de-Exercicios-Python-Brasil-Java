package pacote;
import java.util.Scanner;
public class Lista_Python_1_16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("informe o tamanho em metros² da área a ser pintada: ");
	    double m = teclado.nextDouble();
	    double litro = m/3;
	    double lata = Math.ceil(litro/18) ;
	    double preco = lata*80;
	    System .out.println("você precisa comprar " + lata + " latas que custam " + preco + " R$ no total!");
	    teclado.close();
	}

}
