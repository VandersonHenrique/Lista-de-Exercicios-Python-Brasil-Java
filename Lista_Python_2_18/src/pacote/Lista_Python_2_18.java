package pacote;

import java.util.Scanner;

public class Lista_Python_2_18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite o dia: ");
	    int dia = teclado.nextInt();
	    System.out.println("Digite o mês: ");
	    int mes = teclado.nextInt();
	    System.out.println("Digite o ano: ");
	    int ano = teclado.nextInt();

	    if(ano>0){
	      if(mes>0 && mes<13){
	      if((ano%400==0) || ano%4==0 && ano%100!=0){
	        if(mes==2){
	          if(dia>0 && dia<30){
	              System.out.println(dia + "/0" + mes + "/" + ano + " é uma data valida");
	            }
	            else{
	              System.out.println("dia " + dia + " não é uma data valida");
	            }
	          }
	        }
	        else if(mes==2){
	          if(dia>0 && dia<29){
	            System.out.println(dia + "/0" + mes + "/" + ano + " é uma data valida");
	            }
	            else{
	              System.out.println("dia " + dia + " não é uma data valida");
	            }
	        }
	        
	        
	        if(mes==1 ||mes==3 ||mes==5 ||mes==7 ||mes==8 ||mes==10 || mes==12){
	            if(dia>0 && dia<32){
	              System.out.println(dia + "/" + mes + "/" + ano + " é uma data valida");
	            }
	            else{
	              System.out.println("dia " + dia + " não é uma data valida");
	            }
	          }
	          else if(mes==4 ||mes==6 ||mes==9 ||mes==11){
	            if(dia>0 && dia<31){
	              System.out.println(dia + "/" + mes + "/" + ano + " é uma data valida");
	            }
	            else{
	              System.out.println("dia " + dia + " não é uma data valida");
	            }
	          }
	      } 
	      else{
	        System.out.println("mês " + mes + "não é uma data valida");
	      }
	    }
	    else{
	      System.out.println("ano " + ano + " não é uma data valida");
	    }
	    teclado.close();
	}

}
