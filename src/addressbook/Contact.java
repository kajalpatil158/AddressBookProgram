package addressbook;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;
	private int zip;
	private int phoneNumber;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}

	public int getZip() {
		return zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

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

	@Override
	public String toString() {
		return "firstName=" + firstName + ", \n" 
				+ "lastName=" + lastName + ",\n"
				+ "address=" + address + ",\n"
				+ "city=" + city + ",\n"
				+ "state=" + state + ",\n"
				+ "email=" + email + ",\n"
				+ "zip=" + zip + ",\n"
				+ "phoneNumber=" + phoneNumber + "\n";
	}

}
