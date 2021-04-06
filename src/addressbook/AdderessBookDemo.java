package addressbook;

import java.util.*;
import java.util.Scanner;

public class AdderessBookDemo {
	private static final String contact = null;

	public static void main(String[] args) {
		System.out.println("Well Come To Address Book Program....");
		Scanner sc = new Scanner(System.in);
		List<Contact> AdderessBook = new LinkedList<Contact>();
		ContactReader contactReader = new ContactReader();
		AdderessBook adderessBook = new AdderessBook();

		addContacts(contactReader, sc, adderessBook);

		System.out.println(adderessBook.print());

		editContact(contactReader, sc, adderessBook);

		System.out.println("Address Book After Edit....");
		System.out.println(adderessBook.print());

		deleteContact(contactReader, sc, adderessBook);

		System.out.println("Address Book After Delete....");
		System.out.println(adderessBook.print());
	}

	private static void addContacts(ContactReader contactReader, Scanner sc, AdderessBook adderessBook) {
		Contact contact1 = contactReader.readContact(sc);
		adderessBook.putContact(contact1);

		Contact contact2 = contactReader.readContact(sc);
		adderessBook.putContact(contact2);

		Contact contact3 = contactReader.readContact(sc);
		adderessBook.putContact(contact3);
	}
public boolean checkDuplicate(String firstName) {
		int flag = 0;
		for (Contact c : AdderessBook) {
			if (c.getFirstName().equals(firstName)) {
				flag = 1;
				break;
			}
		}
		return flag == 1;
	}

	public static void show() {

		System.out.println("contact"+contact);
	}
	public static void editContact(ContactReader contactReader, Scanner sc, AdderessBook adderessBook) {
		System.out.println("Enter firstName to edit");
		String firstName = sc.next();
		Contact contact = adderessBook.getContact(firstName);
		if (contact == null) {
			System.out.println("No person find to edit");
		}
		contactReader.updateContact(sc, contact);
	}

	public static void deleteContact(ContactReader contactReader, Scanner sc, AdderessBook adderessBook) {
		System.out.println("Enter firstName to delete");
		String firstName = sc.next();
		Contact contact = adderessBook.getContact(firstName);
		if (contact == null) {
			System.out.println("No person find to delate");
		}
		adderessBook.deleteContact(contact);
	}
	
	public static void searchByCity() {
		System.out.println("Enter The City You Want To Search");
		String city = sc.next();
		for (Contact c : adderessBook) {
			if (c.getCity().equals(city)) {

				System.out.println(b);
				break;
			} else {
				System.out.println("City Does Not Exist");
			}
		}
	}

	public static void searchByState() {

		System.out.println("Enter The State You Want To Search");
		String state = sc.next();
		for (Contact c : adderessBook) {
			if (c.getState().equals(state)) {

				System.out.println(b);
				break;
			} else {
				System.out.println("State Does Not Exist");
			}
		}

	}
}