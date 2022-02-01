import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;	
			System.out.println("Uzkrita skaitlis "+skaitlis);
		}
	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		int izvele;
		do{
			System.out.println("1-mest kaulinu | 2- apturet");
			izvele = scan.nextInt();
			switch(izvele){
			case 1: 
			
		do{
		System.out.println("Cik reizes mest kauli�u?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
		break;
		case 2: 
			System.out.println("Programma aptureta");
			break; 
			default: System.out.println("Nav tadas opcijas, ja nu kas markuss small brein");
		}
		}while(izvele!=2);
	}
}
