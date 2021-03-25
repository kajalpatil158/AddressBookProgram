package addressbook;

import java.util.Scanner;

public class Adderessbook {
	public static void main(String[] args) {
		// Well come message
		System.out.println("Well Come To Address Book Program....");
		// System.in is a standard input stream
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name :- ");
		String firstName = sc.nextLine(); // reads string
		System.out.println("Enter last name :- ");
		String lastName = sc.nextLine(); // reads string
		System.out.println("Enter address :- ");
		String address = sc.nextLine(); // reads string
		System.out.println("Enter city :- ");
		String city = sc.nextLine(); // reads string
		System.out.println("Enter state :- ");
		String state = sc.nextLine(); // reads string
		System.out.println("Enter email :- ");
		String email = sc.nextLine(); // reads string
		System.out.println("Enter zip :- ");
		int zip = sc.nextInt(); // reads Integer
		System.out.println("Enter phoneNumber :- ");
		int phoneNumber = sc.nextInt(); // reads Integer
		Address data = new Address();
		data.setFirstName(firstName);
		data.setLastName(lastName);
		data.setaddress(address);
		data.setCity(city);
		data.setState(state);
		data.setEmail(email);
		data.setZip(zip);
		data.setPhoneNumber(phoneNumber);

		System.out.println("firstName: " + data.getFirstName());
		System.out.println("lastName: " + data.getLastName());
		System.out.println("address: " + data.getAddress());
		System.out.println("city: " + data.getCity());
		System.out.println("state: " + data.getState());
		System.out.println("email: " + data.getEmail());
		System.out.println("zip: " + data.getZip());
		System.out.println("phoneNumber: " + data.getPhoneNumber());
	}
}
