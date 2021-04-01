package addressbook;
public class Contact {
	public static String firstName;
	public static String lastName;
	public static String address;
	public static String city;
	public static String state;
	public  static String email;
	public static int zip;
	public static int phoneNumber;
	public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip,
			int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static String print()
	{
		return "firstName=" + firstName + " \n" + "lastName=" + lastName + "\n" + "address=" + address + "\n"
				+ "city=" + city + "\n" + "state=" + state + "\n" + "email=" + email + "\n" + "zip=" + zip + "\n"
				+ "phoneNumber=" + phoneNumber + "\n";
	}

}
