import java.util.Scanner;
import java.io.PrintStream;
import java.util.Random;
public class Jogo {
	 public static void main(String[] args) {
	        // TODO code application logic here
	        
	        
	PrintStream show = System.out;
	Scanner scan = new Scanner(System.in);
	Random gerador = new Random();
	        
	        
	int op ;
	int cpu_choice;
	int user_choice;
	        

	show.println("Ol�! Como se chama?");
	String nome = scan.nextLine();
	show.println("Prazer em conhece-lo" + nome +"!");
	show.println(nome + "Voce que jogar comigo?");
	show.println("/n informe o n�mero da sua op��o./n 1 -> sim. /n 2 -> n�o /n" );
	 op = scan.nextInt();
	 
	 
	 if ( op == 2 ) { 

	show.println("Que Pena!! mas tudo bem, fica pra pr�xima");
	} else if (op ==1 ) {  
	      show.println("ok, ..o jogo � assim...");
	      show.println("Eu vou escolher um numero de 0 a 10");
	       show.println("tente advinahr qual �, e voce sera o vencedor");
	    
	cpu_choice = gerador.nextInt(11);
	   show.println ("OK, " +nome+ ". Eu ja escolhi");
	   show.println ("ok, agora tente advinhar!!") ;

	     do { 
	     user_choice = scan.nextInt();
	       if ( user_choice != cpu_choice) { 
	           show.println("Resposta errada");
	      } else { 
	          show.println("parab�ns! Voc�, acertou!!!");
	        }
	     } while (cpu_choice != user_choice);
	 
	 


	    }
	}
	}


