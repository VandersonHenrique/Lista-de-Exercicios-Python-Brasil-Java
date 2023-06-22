package pacote;
import java.util.Scanner;
public class Lista_Python_2_1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Digite o primeiro número: ");
	    float n1 = teclado.nextFloat();
	    System.out.print("Digite o segundo número: ");
	    float n2 = teclado.nextFloat();
	    if (n1>n2){
	    System.out.println("o maior número é " + n1 + "!");
	    }
	    else{
	     System.out.println("o maior número é " + n2 + "!");
	    }
	    teclado.close();
	}

}
