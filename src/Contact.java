/**
 * One Object of a Contact Stores the info for a single contact
 *
 */
public class Contact implements Comparable {
	private String emailAddress;
	private String phoneNumber;
	private String note;
	private Name name;
	private StreetAddress streetAddress;

	/**
	 * Set the emailAddress to the user input Email
	 */
	public void setEmail(String newEmail) {

		emailAddress = newEmail;
		// System.out.println("setEmail called");
	}

	/**
	 * Set the phone to the user input phone
	 */
	public void setPhone(String newPhone) {
		phoneNumber = newPhone;
		// System.out.println("setPhone called");
	}

	/**
	 * Set the note to the user input newNote
	 */
	public void setNote(String newNote) {
		note = newNote;
		// System.out.println("setNote called");

	}

	/**
	 * Set the name to a newName object
	 */
	public void setName(Name newName) {

		name = newName;
		// System.out.println("setName called");

	}

	/**
	 * Set the address to a new address object
	 */
	public void setAddress(StreetAddress newStreetAddress) {

		streetAddress = newStreetAddress;
		// System.out.println("setAddress called");

	}
	
	/**
	 * This method returns the email of the Contact
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * This method returns the name of the Contact
	 */
	public Name getName(){
		return name;
	}
	

	/**
	 * returns a contact object in a formatted String
	 */
	public String toString() {
		String tempString = "";
		// System.out.println("in method toString in Contact ");
		if (name.getFirstName().equals("")) {
			tempString = tempString + "\n" + name.getLastName();
		} else {
			tempString = tempString + "\n" + name;
		}

		if (!(streetAddress.equals(""))) {
			tempString = tempString + "\n" + streetAddress;
		}
		if (!(emailAddress.equals(""))) {
			tempString = tempString + "\n" + emailAddress;
		}
		if (!(phoneNumber.equals(""))) {
			tempString = tempString + "\n" + phoneNumber;
		}
		if (!(note.equals(""))) {
			tempString = tempString + "\n" + "Note: " + note;
		}

		return tempString;

		// return name+"\n"+ streetAddress+"\n"+ emailAddress +"\n"+
		// phoneNumber;
	}

	/**
	 * compares newName to the lastName of the contact returns less than 0 if
	 * less, returns 0 if they are the same, returns greater than 0 if it is
	 * larger
	 */
	public int compareTo(Object newContact) {
		
		int	lastNameCompare= name.getLastName().compareToIgnoreCase( ((Contact) newContact).getName().getLastName());
		if (0!=lastNameCompare){
			return lastNameCompare;
		}
		else {
		return	name.getFirstName().compareToIgnoreCase(((Contact) newContact).getName().getFirstName());
			
			
			
		}
	}
}
