package pacote;

import java.util.Scanner;

public class Lista_Python_2_19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite um número inteiro menor que 1000: ");
	    int n1 = teclado.nextInt();
	    int unidade = n1%10;
	    int dezena = (n1-unidade)%100;
	    int centena = (n1-dezena-unidade)%1000;

	    if(dezena==10){
	      dezena=1;
	    }
	    else if(dezena==20){
	      dezena=2;
	    }
	    else if(dezena==30){
	      dezena=3;
	    }
	    else if(dezena==40){
	      dezena=4;
	    }
	    else if(dezena==50){
	      dezena=5;
	    }
	    else if(dezena==60){
	      dezena=6;
	    }
	    else if(dezena==70){
	      dezena=7;
	    }
	        else if(dezena==80){
	      dezena=8;
	    }
	        else if(dezena==90){
	      dezena=9;
	    }

	    if(centena==100){
	      centena=1;
	    }
	    else if(centena==200){
	      centena=2;
	    }
	    else if(centena==300){
	      centena=3;
	    }
	    else if(centena==400){
	      centena=4;
	    }
	    else if(centena==500){
	      centena=5;
	    }
	    else if(centena==600){
	      centena=6;
	    }
	    else if(centena==700){
	      centena=7;
	    }
	    else if(centena==800){
	      centena=8;
	    }
	    else if(centena==900){
	      centena=9;
	    }
	    
	    if(centena>1){
	      if(dezena>1 || dezena==0){
	        if(unidade>1 || unidade==0){
	          System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidade");
	        }
	      }
	      else if(dezena==1){
	        if(unidade>1 || unidade==0){
	          System.out.println(centena + " centenas, " + dezena + " dezena e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(centena + " centenas, " + dezena + " dezena e " + unidade + " unidade");
	        }   
	      }
	    }
	    else if(centena==1){
	            if(dezena>1 || dezena==0){
	        if(unidade>1 || unidade==0){
	          System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(centena + " centena, " + dezena + " dezenas e " + unidade + " unidade");
	        }
	      }
	      else if(dezena==1){
	        if(unidade>1 || unidade==0){
	          System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(centena + " centena, " + dezena + " dezena e " + unidade + " unidade");
	        }   
	      }
	    }
	    else if (centena==0){
	            if(dezena>1){
	        if(unidade>1 || unidade==0){
	          System.out.println(dezena + " dezenas e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(dezena + " dezenas e " + unidade + " unidade");
	        }
	      }
	      else if(dezena==1){
	        if(unidade>1 || unidade==0){
	          System.out.println(dezena + " dezena e " + unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(dezena + " dezena e " + unidade + " unidade");
	        }   
	      }
	      else if(dezena==0){
	                if(unidade>1 || unidade==0){
	          System.out.println(unidade + " unidades");
	        }
	        else if(unidade==1){
	          System.out.println(unidade + " unidade");
	        }  
	      }
	    }
	    
	    teclado.close();
	}

}
