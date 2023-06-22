package pacote;

import java.util.Scanner;

public class Lista_Python_2_25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    int classificacao = 0 ;
	    System.out.println("programa de investigação");
	    System.out.println("Responda as perguntas com  s (SIM) ou n (NÃO)");
	        System.out.println("Você telefonou para a vitima?");
	    char telefonou = teclado.next().charAt(0);
	    if(telefonou== 's'){
	      classificacao = classificacao + 1;
	    }   
	    
	        System.out.println("Você esteve no local do crime?");
	    char local = teclado.next().charAt(0);;
	    if(local== 's'){
	      classificacao = classificacao + 1;
	    }   
	    
	        System.out.println("Você mora perto da vitima?");
	    char mora = teclado.next().charAt(0);;
	    if(mora== 's'){
	      classificacao = classificacao + 1;
	    }
	    
	        System.out.println("Você devia para a vitima?");
	    char devia = teclado.next().charAt(0);;
	    if(devia== 's'){
	      classificacao = classificacao + 1;
	    }
	    
	        System.out.println("Você trabalhou com a vitima?");
	    char trabalhou = teclado.next().charAt(0);; 
	    if(trabalhou== 's'){
	      classificacao = classificacao + 1;
	    }
	      if(classificacao < 2){
	        System.out.println("Inocente");
	      }
	    else if (classificacao  == 2 )
	     {
	      System.out.println("Suspeito");
	    }
	    else if (classificacao  <=  4){
	     System.out.println("Cumplice");
	    }
	    else{
	       System.out.println("Assasino");
	    }
	      teclado.close();
	}

}
