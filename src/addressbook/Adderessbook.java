package addressbook;

import java.util.HashMap;
import java.util.Map;

public class AdderessBook {
	Map<String, Contact> contacts = new HashMap<String, Contact>();

	public void putContact(Contact contact) {
		contacts.put(contact.getFirstName(), contact);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("AdderessBook");
		for (Contact contact2 :contacts.values()) {
			sb.append("\n contact: ").append(contact2);
		}
		return sb.toString();
	}

}
