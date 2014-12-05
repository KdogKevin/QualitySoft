import java.util.Arrays;
import java.io.Serializable;
import java.util.Scanner;

/**
 * One object of this class creates an array of contact objects
 * 
 */

public class ContactList implements Serializable {
	private static final long serialVersionUID = 1L;
	private final int FINAL_LIST_SIZE = 10;
	private Contact[] allContacts;
	private int counter = 0;
	private Contact tempContact = new Contact();

	/**
	 * Constructor for ContactList where we will create the contactList array
	 * that stores contact objects
	 */
	public ContactList() {

		allContacts = new Contact[FINAL_LIST_SIZE];
	}

	/**
	 * Prompts user to enter specific contact info and then stores the new
	 * contact into a free position in the ContactList
	 * 
	 */
	public void createContact() {
		
		if (!(counter >= FINAL_LIST_SIZE)) {
			if (readName() == true) {
				readStreetAddress();
				readOtherInfo();
				saveToContactList();
			} else {
				System.out
						.println("You must enter a contact's last name in order for a contact to be entered.");
			}

		} else {
			System.out
					.println("Contact can't be added.  Contact list is full.");
		}
	}
		
	/**
	 * This method prompts the user for the lastname, if no last name is entered it returns false. 
	 * If entered then prompts the user for firstname and then stores the names for the contact in a 
	 * name object 	
	 */
		
	public boolean readName(){
		System.out.println("What is the last name?");
		String lastName = getNextInput();
		if (!(lastName.equals(""))) {
			System.out.println("What is the first name?");
			String firstName = getNextInput();

			Name contactName;
			contactName = new Name(firstName, lastName);

			tempContact.setName(contactName);
			return true;
		}else {
			return false;
		}
	} 
	/**
	 * This method prompts the user for address info and then stores the address info for the contact in a 
	 * StreetAddress object 	
	 */
		
	public void readStreetAddress(){
		StreetAddress xStreetAddress;
		xStreetAddress = new StreetAddress();
		System.out.println("What is the House number?");
		String house = getNextInput();
		System.out.println("What is the city?");
		String city = getNextInput();
		System.out.println("What is the state?");
		String state = getNextInput();

		System.out.println("What is the zip?");
		String zip = getNextInput();
		System.out.println("" + "What is the country?");
		String country = getNextInput();
		xStreetAddress.setHouse(house);
		xStreetAddress.setCity(city);
		xStreetAddress.setState(state);
		xStreetAddress.setZip(zip);
		xStreetAddress.setCountry(country);
		tempContact.setAddress(xStreetAddress);
	}
	/**
	 * This method prompts the user for email, phone-number and Note (if wanted), then stores the info in the contact object 	
	 */
		
	public void readOtherInfo() {
		System.out.println("What is the email");
		tempContact.setEmail(getNextInput());
		System.out.println("what is the phone number");
		tempContact.setPhone(getNextInput());
		System.out.println("Do you want to enter a Note for the contact (Y/N)");
		String setNote = getNextInput();
		if (setNote.equalsIgnoreCase("y")) {
			System.out.println("Please enter in the note.");
			tempContact.setNote(getNextInput());
		} else {
			tempContact.setNote("");
		}
	}
	/**
	 * This method stores the Contact() in the next open spot in the ContactList[]
	 */
		
	public void saveToContactList(){
		allContacts[counter] = tempContact;
		counter++;
		tempContact = new Contact ();
		System.out.println("Contact has been added.");
	}

	/*
		Contact tempContact = new Contact();
		if (!(counter >= FINAL_LIST_SIZE)) {
			System.out.println("What is the last name?");
			String lastName = getNextInput();
			if (!(lastName.equals(""))) {
				System.out.println("What is the first name?");
				String firstName = getNextInput();

				Name contactName;
				contactName = new Name(firstName, lastName);

				tempContact.setName(contactName);

				System.out.println("What is the email");
				tempContact.setEmail(getNextInput());
				System.out.println("what is the phone number");
				tempContact.setPhone(getNextInput());
				StreetAddress xStreetAddress;
				xStreetAddress = new StreetAddress();
				System.out.println("What is the House number");
				String house = getNextInput();
				System.out.println("What is the city ");
				String city = getNextInput();
				System.out.println("What is the state");
				String state = getNextInput();

				System.out.println("What is the zip");
				String zip = getNextInput();
				System.out.println("" + "What is the country");
				String country = getNextInput();
				xStreetAddress.setHouse(house);
				xStreetAddress.setCity(city);
				xStreetAddress.setState(state);
				xStreetAddress.setZip(zip);
				xStreetAddress.setCountry(country);
				tempContact.setAddress(xStreetAddress);
				System.out
						.println("Do you want to enter a Note for the contact (Y/N)");
				String setNote = getNextInput();
				if (setNote.equalsIgnoreCase("y")) {
					System.out.println("Please enter in the note.");
					tempContact.setNote(getNextInput());
				} else {
					tempContact.setNote("");
				}
				;
				allContacts[counter] = tempContact;
				counter++;
				System.out.println("Contact has been added.");
			} else {
				System.out
						.println("You must enter a contact's last name in order for a contact to be entered.");
			}
		} else {
			System.out
					.println("Contact can't be added.  Contact list is full.");
		}
	}
*/
	/**
	 * Sorts the ContactList by last name
	 */
	public void sort() {
		Arrays.sort(allContacts, 0, counter);

	}

	/**
	 * Returns the Contact list in string format
	 */
	public String toString() {
		String contactListString = "";

		for (int i = 1; i <= counter; i++) {

			contactListString += "\n\n" + i + ")" + allContacts[i - 1];

		}
		return contactListString;
	}

	/**
	 * Compares the last Name that was input to the last names in the current
	 * contact list, then returns the contact in String format with the input
	 * last name
	 */
	public String getContactByLastName(String parLastName) {
		String tempString = "";
		for (int j = 0; j < counter; j++) {
			if (allContacts[j].getName().getLastName()
					.compareToIgnoreCase(parLastName) == 0) {
				tempString += allContacts[j] + "\n";
			}
		}
		if (tempString == "") {
			System.out.println("Contact is not in the contact list.");
		}
		return tempString;
	}

	/**
	 * Compares the email that was input to the email in the current contact
	 * list, then returns the contact in String format with the input email
	 */
	public String getContactByEmail(String parEmail) {
		String tempEmailString = "";
		for (int k = 0; k < counter; k++) {
			if (allContacts[k].getEmailAddress().compareToIgnoreCase(parEmail) == 0) {
				tempEmailString += allContacts[k] + "\n";
			}
		}
		if (tempEmailString == "") {
			System.out.println("Contact is not in the contact list.");
		}
		return tempEmailString;
	}

	/**
	 * Compares the zip code that was input to the zip code in the current
	 * contact list, then returns the contact in String format with the input
	 * zip code
	 */
	public String getContactByZip(String parZip) {
		String tempStringZip = "";
		for (int index = 0; index < counter; index++) {
			if (allContacts[index].getStreetAddress().getZip()
					.compareToIgnoreCase(parZip) == 0) {
				tempStringZip += allContacts[index] + "\n";
			}
		}
		if (tempStringZip == "") {
			System.out.println("Contact is not in the contact list.");
		}
		return tempStringZip;
	}

	public String getNextInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
