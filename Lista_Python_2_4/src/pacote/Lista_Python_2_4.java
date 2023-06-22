package pacote;

import java.util.Scanner;

public class Lista_Python_2_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Digite uma letra: ");
	    char letra = teclado.next().charAt(0);;           
	if(letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'||letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
	        System.out.print(letra + " é uma vogal!");  
	      }
	    else{
	    System.out.print(letra + " é uma consoante!");
	    }
	teclado.close();
	}

}
