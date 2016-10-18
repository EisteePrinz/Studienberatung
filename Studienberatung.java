import java.util.*;

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
		else if (a1.equals("n")){
			System.out.println("Hast du Fachabitur?");
			String a3 = scanner.next();
				if(a3.equals("j")){
					System.out.println("Hast du eine Berufsausbilding?")
					String a4 = scanner.next();
					if(a4.equals("j"){
						System.out.println("Später studieren");
						
					}
					else if (a4.equals("n"){
						System.out.println("Besser studieren");
					}
				}
			
			
			
			else if(a3.equals("n")){
				System.out.println("Nicht studieren");
			}
		}
		

	}
}