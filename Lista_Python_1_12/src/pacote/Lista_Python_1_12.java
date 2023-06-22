package pacote;
import java.util.Scanner;
public class Lista_Python_1_12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("digite sua altura em metros : ");
	    Double altura = teclado.nextDouble();
	    Double pesoideal = 72.7*altura - 58;
	     System.out.printf("o peso ideal para sua altura é = %.2f %n",  (pesoideal)); 
	     teclado.close();
	}

}
