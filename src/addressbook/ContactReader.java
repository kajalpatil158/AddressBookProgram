package addressbook;

import java.util.Scanner;

public class ContactReader {

	public Contact readContact(Scanner sc) {
		String firstName = readString(sc, "Enter first name :- ");
		String lastName = readString(sc, "Enter last name :- ");
		String address = readString(sc, "Enter Address :- ");
		String city = readString(sc, "Enter City :- ");
		String state = readString(sc, "Enter State :- ");
		String email = readString(sc, "Enter Email :- ");
		int zip = readInt(sc, "Enter Zip :- ");
		int phoneNumber = readInt(sc, "Enter Phone Number :- ");

		return new Contact(firstName, lastName, address, city, state, email, zip, phoneNumber);
	}

	public String readString(Scanner sc, String message) {
		System.out.println(message);
		return sc.nextLine(); // reads string
	}

	public int readInt(Scanner sc, String message) {
		System.out.println(message);
		return sc.nextInt();
	}
}
