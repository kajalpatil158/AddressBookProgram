package addressbook;

import java.util.Scanner;

public class AdderessBookDemo {
	public static void main(String[] args) {
		System.out.println("Well Come To Address Book Program....");
		Scanner sc = new Scanner(System.in);

		ContactReader contactReader = new ContactReader();
		AdderessBook adderessBook = new AdderessBook();

		addContacts(contactReader, sc, adderessBook);

		System.out.println(adderessBook.print());

		editPerson(contactReader, sc, adderessBook);

		System.out.println("Address Book After Edit....");
		System.out.println(adderessBook.print());
	}

	private static void addContacts(ContactReader contactReader, Scanner sc, AdderessBook adderessBook) {
		Contact contact1 = contactReader.readContact(sc);
		adderessBook.putContact(contact1);

		Contact contact2 = contactReader.readContact(sc);
		adderessBook.putContact(contact2);
	}

	private static void editPerson(ContactReader contactReader, Scanner sc, AdderessBook adderessBook) {
		System.out.println("Enter firstName to edit");
		String firstName = sc.next();
		Contact contact = adderessBook.getContact(firstName);
		if (contact == null) {
			System.out.println("No person find to edit");
		}

		contactReader.updateContact(sc, contact);
	}
}