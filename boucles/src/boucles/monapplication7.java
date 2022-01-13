package boucles;
import java.util.Scanner;
public class monapplication7 {
	public static void main(String[] args) {
		System.out.println("demo boucle while");
		String prenom;
		char response = 'O';
		
		Scanner sc = new Scanner (System.in);
		while(response == 'O') {
			System.out.println("donner un prenom :");
			prenom = sc.nextLine();
			System.out.println("bonjour"+prenom+"comment tu vas");
			System.out.println("voulez vous ressayer ? (O/N)");
			response = sc.nextLine().charAt(0);
		}
		System.out.println("AU REVOIR.....");
		
	}
}
