package pacote;
import java.util.Scanner;
public class Lista_Python_1_13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("digite sua altura em metros : ");
	    double H = teclado.nextDouble();
	    System.out.println("informe seu sexo (1)Masculino, (2)Feminino: ");
	    int s = teclado.nextInt();
	    if ( s == 1 ){
	      Double peso = (72.7*H) - 58;
	      System.out.printf("seu peso ideal seria: %.2f %n kgs ",  (peso));
	    }
	    else{
	      Double peso = (62.1*H) - 44.7;
	      System.out.printf("seu peso ideal seria: %.2f %n kgs ",  (peso));
	    }
	    teclado.close();
	}

}
