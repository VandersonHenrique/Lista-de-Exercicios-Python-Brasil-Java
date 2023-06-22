package pacote;

import java.util.Scanner;

public class Lista_Python_2_28 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		System.out.println("Informe o tipo da carne escolhida: ");
		    String tipoCarne = teclado.nextLine();

		 System.out.println("Informe a quantidade comprada: ");
		double qtd = teclado.nextDouble();
		           

		System.out.println("Usará cartao Tabajara (S/N): ");
		char cartaoTabajara = teclado.next().charAt(0);
		                     

		System.out.println("\n-------------- CUPOM FISCAL -------------- ");

		double valorBruto;
		if (tipoCarne == "1"){
		    System.out.println("Carne Escolhida: File Duplo");
		    if (qtd <= 5){
		      
		        valorBruto = qtd * 4.9;
		          }
		      
		    else{
		      
		        valorBruto = qtd * 5.8;
		    }
		          }
		else if (tipoCarne == "2"){
		  
		    System.out.println("Carne Escolhida: Alcatra");
		    if (qtd <= 5){
		      
		        valorBruto = qtd * 5.9;
		    }
		    else{
		      
		    
		        valorBruto = qtd * 6.8;
		    }
		          }
		else{
		    System.out.println("Carne Escolhida: Picanha");
		    if (qtd <= 5){
		        valorBruto = qtd * 6.9;
		    }
		    else{
		        valorBruto = qtd * 7.8;
		    }
		      }
		    
		System.out.printf("Valor Bruto deu: R$ %.2f %n", valorBruto);


		double desconto = 0.0;
		if (cartaoTabajara == 'S' ||cartaoTabajara == 's'){
		  
		   System.out.println("Pagamento COM Cartao Tabajara");
		    desconto = valorBruto * 0.05;
		     }
		else{
		    System.out.println("Pagamento NÃO sera com o cartao Tabajara");
		}
		    System.out.printf("Desconto: %.2f %n", desconto);
		    double valorpagar = valorBruto - desconto;
		System.out.printf("Valor a Pagar: %.2f %n", valorpagar);
		System.out.println("------------------------------------------ ");
		teclado.close();
	}

}
