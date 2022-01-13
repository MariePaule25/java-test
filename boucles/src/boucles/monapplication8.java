package boucles;
import java.util.Scanner;
public class monapplication8 {
	public static void main(String[] args) {
		System.out.println("demo boucle do while");
		String prenom =  new String();
		char response = ' ';
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("donner un prenom :");
			prenom = sc.nextLine();
			System.out.println("bonjour"+prenom+"comment tu vas");
			
			do {
				System.out.println("voulez vous ressayer ? (O/N)");
				response = sc.nextLine().charAt(0);
			}while(resonse != 'O'  &&  
					)
		}while(response == 0);
		System.out.println("AU REVOIR.....")
		
	}
}
