/**
 * One Object of a Contact Stores the info for a single contact
 *
 */
public class Contact implements Comparable
{
	private String emailAddress;
	private String phoneNumber;
	private String note;
	private Name name;
	private StreetAddress streetAddress;

	/**
	 * Set the emailAddress to the user input Email
	 */
	public void setEmail(String newEmail) {

		System.out.println("setEmail called");

	}
	

	/**
	 * Set the phone to the user input phone
	 */
	public void setPhone(String newPhone) {
		System.out.println("setPhone called");

	}

	/**
	 * Set the note to the user input newNote
	 */
	public void setNote(String newNote) {
		System.out.println("setNote called");

	}

	/**
	 * Set the name to a newName object
	 */
	public void setName(Name newName) {
		// par gets new Name()
		System.out.println("setName called");

	}

	/**
	 * Set the address to a new address object
	 */
	public void setAddress(StreetAddress newStreetAddress) {
		// par gets new StreetAddress()
		System.out.println("setAddress called");

	}



	/**
	 * returns a contact object in a formatted String
	 */
	public String toString() {
		return "";
	}

	/**
	 * compares newName to the lastName of the contact
	 * returns less than 0 if less, returns 0 if they are the same, returns greater than 0 if it is larger
	 */
	public int compareTo(Object newContact) {
		return 0;
	
	}
}
