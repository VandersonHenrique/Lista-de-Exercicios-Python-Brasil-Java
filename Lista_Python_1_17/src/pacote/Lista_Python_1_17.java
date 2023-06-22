package pacote;
import java.util.Scanner;
public class Lista_Python_1_17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Qual o tamanho em metros quadrados da área a ser pintada: ");
	    double area = teclado.nextDouble();
	    int lata = 18;
	    double galao = 3.6;
	    
	    double nl = Math.ceil(area/lata/6);
	    double preco = nl*80;
	    System.out.println("você pode pintar a área se comprar " + nl + " latas por " + preco + " reais!");
	    
	    double ng = Math.ceil(area/galao/6);
	    preco = ng*25;
	    System.out.println("você pode pintar a área se comprar " + ng + " galões por " + preco + " reais!");
	    area += area*0.1;

	    ng = Math.ceil(area/galao/6);
	    nl = Math.floor(ng/5);
	    ng = ng%5;
	    preco = ng*25+nl*80;
	    System.out.println("você pode pintar a área se comprar " + ng + " galões e " + nl + " latas por " + preco + " reais!");
	    teclado.close();
	}

}
