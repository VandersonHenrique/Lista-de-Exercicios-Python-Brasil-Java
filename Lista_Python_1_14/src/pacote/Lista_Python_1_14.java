package pacote;
import java.util.Scanner;
public class Lista_Python_1_14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
	    System.out.println("Isira o peso de peixes em Kg: ");
	    double peso = teclado.nextDouble();
	    double excesso = (peso-50);
	    if (excesso>0){
	      double multa = (excesso*4.00);
	      System.out.println("você excedeu o limite de peso em " + excesso + " Kg e deverá pagar " + multa + " reais de multa");
	    }
	    else{
	      System.out.println("O peso do seu peixe está de acordo com a norma do estado");
	    }
	    teclado.close();
	}

}
