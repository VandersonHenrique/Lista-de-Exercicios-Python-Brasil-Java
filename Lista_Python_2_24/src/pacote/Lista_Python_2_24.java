package pacote;

import java.util.Scanner;

public class Lista_Python_2_24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe dois numeros para serem somados");
		    double numero1 = teclado.nextDouble();
		    double numero2 = teclado.nextDouble();
		    double soma = numero1 + numero2;

		    System.out.println("Para saber se o resultado dos numeros informados é Par ou impar digite (1), se quiser saber se é Decimal ou inteiro digite (2) ou se quiser saber se ele é Negativo ou positivo digite(3)");
		    int opcao = teclado.nextInt();

		    if (opcao == 1){
		      if(soma % 2 == 0){
		        System.out.println("seu numero é par");
		      }
		      else{
		        System.out.println("seu numero é impar");
		      }
		    }
		      else if (opcao == 2){
		       double arredondar = Math.ceil(soma);
		      if (soma == arredondar ) {
		        System.out.println("O numero informado é inteiro");
		      }
		        else {
		          System.out.println("O numero informado é decimal");
		        }
		      }
		    else if (opcao == 3){
		      if ( soma > 0){
		        System.out.println("O numero informado é positivo");
		      }
		      else {
		        System.out.println("O numero informado é negativo");
		      }
		    }
		    else {
		      System.out.println("Opção invalida");
		    }
		    teclado.close();
	}

}
