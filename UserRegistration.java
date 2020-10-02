import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	private String firstName;
	private String lastName;
	private String emailId;

	private void addFirstName() {
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
	}
	
	private void addLastName() {
		boolean validCounter = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Last Name: ");
			lastName = sc.nextLine();
			if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName)) {
				validCounter = true;
				System.out.println("Valid!");
			}
			else
				System.out.println("Invalid. Please enter again!");
		} while(!validCounter);
	}
	
	private void addEmail() {
		boolean validCounter = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Email ID: ");
			emailId = sc.nextLine();
			if(Pattern.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$", emailId)) {
				validCounter = true;
				System.out.println("Valid!");
			}
			else
				System.out.println("Invalid. Please enter again!");
		} while(!validCounter);
		sc.close();
	}
	
	public static void main(String[] args) {
		UserRegistration userOne = new UserRegistration();
		userOne.addFirstName();
		userOne.addLastName();
		userOne.addEmail();
	}
}
