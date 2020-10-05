import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {
	// private String firstName;
	// private String lastName;
	// private String emailId;
	// private String mobileNo;
	// private String password;

	// private void addFirstName() {
		// boolean validCounter = false;
		// Scanner sc = new Scanner(System.in);
		// do {
			// System.out.println("First Name: ");
			// firstName = sc.nextLine();
			// if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName)) {
				// validCounter = true;
				// System.out.println("Valid!");
			// }
			// else
				// System.out.println("Invalid. Please enter again!");
		// } while(!validCounter);
	// }

	// private void addLastName() {
		// boolean validCounter = false;
		// Scanner sc = new Scanner(System.in);
		// do {
			// System.out.println("Last Name: ");
			// lastName = sc.nextLine();
			// if(Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName)) {
				// validCounter = true;
				// System.out.println("Valid!");
			// }
			// else
				// System.out.println("Invalid. Please enter again!");
		// } while(!validCounter);
	// }

	private boolean addEmail(String emailId) {
		return emailId.matches("^[a-zA-Z0-9_]+([.+-]{1}[a-zA-Z0-9_]+)*[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z]{2,})?$");
	}

	// private void addMobile() {
		// boolean validCounter = false;
		// Scanner sc = new Scanner(System.in);
		// do {
			// System.out.println("Mobile No: ");
			// mobileNo = sc.nextLine();
			// if(Pattern.matches("^[0-9]{2}[ ][0-9]{10}$", mobileNo)) {
				// validCounter = true;
				// System.out.println("Valid!");
			// }
			// else
				// System.out.println("Invalid. Please enter again!");
		// } while(!validCounter);
	// }

	// private void addPassword() {
		// boolean validCounter = false;
		// Scanner sc = new Scanner(System.in);
		// do {
			// System.out.println("Password: ");
			// password = sc.nextLine();
			// if(Pattern.matches("(?=^.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%_][0-9a-zA-Z]*", password)) {
				// validCounter = true;
				// System.out.println("Valid!");
			// }
			// else
				// System.out.println("Invalid. Please enter again!");
		// } while(!validCounter);
	// }

	public static void main(String[] args) {
		UserRegistration userOne = new UserRegistration();
		// userOne.addFirstName();
		// userOne.addLastName();
		String[] emailArray = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
		for(String emailId : emailArray)
			if(userOne.addEmail(emailId))
				System.out.println(emailId + " is VALID");
			else
				System.out.println(emailId + " is INVALID");
		// userOne.addMobile();
		// userOne.addPassword();
	}
}
