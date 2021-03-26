package addressbook;

import java.util.Scanner;

public class AdderessBookDemo {
	public static void main(String[] args) {
		System.out.println("Well Come To Address Book Program....");
		Scanner sc = new Scanner(System.in);

		ContactReader contactReader = new ContactReader();
		AdderessBook adderessBook = new AdderessBook();

		Contact contact1 = contactReader.readContact(sc);
		adderessBook.putContact(contact1);

		Contact contact2 = contactReader.readContact(sc);
		adderessBook.putContact(contact2);

		System.out.println(adderessBook);
	}

}