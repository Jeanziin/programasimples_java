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
	        

	show.println("Olá! Como se chama?");
	String nome = scan.nextLine();
	show.println("Prazer em conhece-lo" + nome +"!");
	show.println(nome + "Voce que jogar comigo?");
	show.println("/n informe o número da sua opção./n 1 -> sim. /n 2 -> não /n" );
	 op = scan.nextInt();
	 
	 
	 if ( op == 2 ) { 

	show.println("Que Pena!! mas tudo bem, fica pra próxima");
	} else if (op ==1 ) {  
	      show.println("ok, ..o jogo é assim...");
	      show.println("Eu vou escolher um numero de 0 a 10");
	       show.println("tente advinahr qual é, e voce sera o vencedor");
	    
	cpu_choice = gerador.nextInt(11);
	   show.println ("OK, " +nome+ ". Eu ja escolhi");
	   show.println ("ok, agora tente advinhar!!") ;

	     do { 
	     user_choice = scan.nextInt();
	       if ( user_choice != cpu_choice) { 
	           show.println("Resposta errada");
	      } else { 
	          show.println("parabéns! Você, acertou!!!");
	        }
	     } while (cpu_choice != user_choice);
	 
	 


	    }
	}
	}


