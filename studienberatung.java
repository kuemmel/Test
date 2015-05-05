import java.util.*;

public class Studienberatung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        String answer;
        System.out.println("Hast Du Abitur?");
        if(scanner.hasNext()) answer = scanner.next();

	if (answer.equals("yes")) {

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
