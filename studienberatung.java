import java.util.*;

public class Studienberatung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        String answer;
        System.out.println("Hast Du Abitur?");
        if(Scanner.hasNext()) answer = Scanner.next();

	if(answer.equals("yes") {
		System.out.println("Hast du Fachabitur?");
        	if(Scanner.hasNext()) answer = Scanner.next();
		
		if(answer.equals("yes")) {
			System.out.println("Hast du eine Berufsausbildung?");
	        	if(Scanner.hasNext()) answer = Scanner.next();
		
			if(answer.equals("yes")) {
				System.out.println("Kannst spaeter");
			else {
				System.out.println("Do it");
			}
		
		} else {
			System.out.println("no");

	} else {
		System.out.println("Bist du wissbegierig?");
		if(scanner.hasNext) answer = scanner.next();
		if (answer.equals("yes")) {
			System.out.println("Studerieren");
		} else {
			System.out.println("No.");
		}
	}
    }
}
