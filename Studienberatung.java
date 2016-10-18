import java.util.Scanner;

public class Studienberatung {
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hast du Abitur?");
		String a1 = scanner.next();
		
		if(a1.equals("j")){
			System.out.println("Bist du wissbegierig?");
			String a2 = scanner.next();
			
			if (a2.equals("j")){
				System.out.println("Auf jedenfall studieren!");	
			}
			else if (a2.equals("n")){
				System.out.println("Nicht studieren");
			}
			
		}
	}
}