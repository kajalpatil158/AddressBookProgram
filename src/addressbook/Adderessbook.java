package addressbook;

import java.util.Scanner;

public class Adderessbook {

	public static void main(String[] args) {
		// Well come message
		System.out.println("Well Come To Address Book Program....");
		// System.in is a standard input stream
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name :- ");
		String firstName = sc.nextLine();
		System.out.println("Enter last name :- ");
		String lastName = sc.nextLine();
		System.out.println("Enter address :- ");
		String address = sc.nextLine();
		System.out.println("Enter city :- ");
		String city = sc.nextLine();
		System.out.println("Enter state :- ");
		String state = sc.nextLine();
		System.out.println("Enter email :- ");
		String email = sc.nextLine();
		System.out.println("Enter zip :- ");
		int zip = sc.nextInt();
		System.out.println("Enter phoneNumber :- ");
		int phoneNumber = sc.nextInt();

	}
}
