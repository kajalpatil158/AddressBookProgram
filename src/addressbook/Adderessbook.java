package addressbook;

import java.util.HashMap;
import java.util.Map;

public class AdderessBook {
	Map<String, Contact> contacts = new HashMap<String, Contact>();

	public void putContact(Contact contact) {
		contacts.put(contact.getFirstName(), contact);
	}

	public Contact getContact(String firstName) {
		return contacts.get(firstName);
	}

	public Contact deleteContact(Contact contact) {
		return contacts.remove(contact);
	}

	public String print() {
		StringBuilder sb = new StringBuilder("AdderessBook");
		for (Contact contact : contacts.values()) {
			sb.append("\n contact: ").append(contact.print());
		}
		return sb.toString();
	}

}
