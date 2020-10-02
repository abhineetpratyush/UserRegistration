import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String firstName;
		boolean validCounter = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("First Name: ");
			firstName = sc.nextLine();
			if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName)) {
				validCounter = true;
				System.out.println("Valid!");
			}
			else
				System.out.println("Invalid. Please enter again!");
		} while(!validCounter);
		sc.close();
	}
}
