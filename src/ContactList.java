import java.util.Arrays;
import java.util.Scanner;

/**
 * One object of this class creates an array of contact objects
 *
 */

public class ContactList {
	private final int FINAL_LIST_SIZE = 10;
	private Scanner scan = new Scanner(System.in);
	private Contact[] allContacts;
	private static int counter = 0;

	/**
	 * Constructor for ContactList where we will create the contactList array
	 * that stores contact objects
	 */
	public ContactList() {

		allContacts = new Contact[FINAL_LIST_SIZE];
		// System.out.println("In Constructor ContactList");
	}

	/**
	 * Prompts user to enter specific contact info and then stores the new
	 * contact into a free position in the ContactList
	 * 
	 */
	public void createContact() {

		// System.out.println("In method createContact");
		Contact tempContact = new Contact();
		if (!(counter >= FINAL_LIST_SIZE)) {
			System.out.println("What is the last name?");
			String lastName = scan.nextLine();
			if (!(lastName.equals(""))) {
				System.out.println("What is the first name?");
				String firstName = scan.nextLine();
				Name contactName;
				contactName = new Name(firstName, lastName);

				tempContact.setName(contactName);

				System.out.println("What is the email");
				tempContact.setEmail(scan.nextLine());
				System.out.println("what is the phone number");
				tempContact.setPhone(scan.nextLine());

				StreetAddress xStreetAddress;
				xStreetAddress = new StreetAddress();
				System.out.println("What is the House number");
				String house = scan.nextLine();
				System.out.println("What is the city ");
				String city = scan.nextLine();
				System.out.println("What is the state");
				String state = scan.nextLine();
				System.out.println("What is the zip");
				String zip = scan.nextLine();
				System.out.println("" + "What is the country");
				String country = scan.nextLine();
				xStreetAddress.setHouse(house);
				xStreetAddress.setCity(city);
				xStreetAddress.setState(state);
				xStreetAddress.setZip(zip);
				xStreetAddress.setCountry(country);
				tempContact.setAddress(xStreetAddress);
				// System.out.println(xStreetAddress);
				System.out
						.println("Do you want to enter a Note for the contact (Y/N)");
				String setNote = scan.nextLine();
				if (setNote.equalsIgnoreCase("y")) {
					System.out.println("Please enter in the note.");
					tempContact.setNote(scan.nextLine());
				} else {
					tempContact.setNote("");
				}
				;
				allContacts[counter] = tempContact;
				counter++;
				// System.out.println("In method createContact");
			} else {
				System.out
						.println("You must enter a contact’s last name in order for a contact to be entered.");
			}
		} else {
			System.out
					.println("Contact can't be added.  Contact list is full.");
		}
		// System.out.println("exiting the ContactList method");
	}

	/**
	 * Sorts the ContactList by last name
	 */
	public void sort() {

		Arrays.sort(allContacts);
		
		System.out.println("In method sort");

	}

	/**
	 * Returns the Contact list in string format
	 */
	public String toString() {

		// System.out.println("In method toString");
		String contactListString = "";

		for (int i = 1; i <= counter; i++) {

			contactListString += "\n" + i + ")" + allContacts[i - 1];

		}
		return contactListString;
	}

	/**
	 * Compares the last Name that was input to the last names in the current
	 * contact list, then returns the contact in String format with the input
	 * last name
	 */
	public String getContactByLastName(String parLastName) {
		String tempString="";
		for (int i =0; i<allContacts.length;i++){
		System.out.println(allContacts[i].getName().getLastName().compareToIgnoreCase(parLastName));
			if (allContacts[i].getName().getLastName().compareToIgnoreCase(parLastName)==0){
				tempString+=allContacts[i]+"\n";
			}
		}


		return tempString;
	}

	/**
	 * Compares the email that was input to the email in the current contact
	 * list, then returns the contact in String format with the input email
	 */
	public String getContactByEmail(String parEmail) {

		System.out.println("In method getContactByEmail");
		return "";
	}

	/**
	 * Compares the zip code that was input to the zip code in the current
	 * contact list, then returns the contact in String format with the input
	 * zip code
	 */
	public String getContactByZip(String parZip) {
		System.out.println("In method getContactByZip");

		return "";
	}
}
