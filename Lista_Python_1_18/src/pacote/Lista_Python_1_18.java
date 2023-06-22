package pacote;
import java.util.Scanner;
public class Lista_Python_1_18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("digite o tamanho do arquivo(MB): ");
	    float tamanho = teclado.nextFloat();
	    System.out.print("digite qual a velocidade do link de Internet(Mbps): ");
	    float velocidade = teclado.nextFloat();
	    float tempos = tamanho/velocidade;
	    float tempom = tempos/60;
	    System.out.printf("irá demorar %.2f minutos para terminar o download!", (tempom));
	    teclado.close();
	}

}
