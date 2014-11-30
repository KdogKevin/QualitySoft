import java.util.Scanner;

/**
 * One object of this class creates an array of contact objects
 *
 */

public class ContactList {
	private int FINAL_LIST_SIZE = 10;
	private Scanner scan = new Scanner(System.in);
	private Contact[] allContacts;

	/**
	 * Constructor for ContactList where we will create the contactList array
	 * that stores contact objects
	 */
	public ContactList() {

		System.out.println("In Constuctor ContactList");
	}

	/**
	 * Prompts user to enter specific contact info and then stores the new
	 * contact into a free position in the ContactList
	 * 
	 */
	public void createContact() {
		System.out.println("In method createContact");

		Contact x = new Contact();

		// System.out.println("what is your first name?");
		// String firstnName =scan.next();
		// String lastname= scan.next();

		Name contactName;
		contactName = new Name("", "");
		x.setName(contactName);

		x.setEmail("");
		x.setPhone("");

		StreetAddress xStreetAddress;
		xStreetAddress = new StreetAddress();
		// String house =scan.next();
		// String city= scan.next();
		// String state =scan.next();
		// String zip= scan.next();
		// String country= scan.next();
		xStreetAddress.setHouse("");
		xStreetAddress.setCity("");
		xStreetAddress.setState("");
		xStreetAddress.setZip("");
		xStreetAddress.setCountry("");
		x.setAddress(xStreetAddress);

		x.setNote("");

		System.out.println("In method createContact");

		// assign x into free position in array

	}

	/**
	 * Sorts the ContactList by last name
	 */
	public void sort() {
		/* Will sort the contact list to be alphabetical order by last name. */
		/*
		 * Arrays.sort();
		 */
		System.out.println("In method sort");

	}

	/**
	 * Returns the Contact list in string format
	 */
	public String ToString() {

		System.out.println("In method toString");
		return "";
	}

	/**
	 * Compares the last Name that was input to the last names in the current
	 * contact list, then returns the contact in String format with the input
	 * last name
	 */
	public String getContactByLastName(String parLastName) {

		System.out.println("In method getContactByLastName");

		return "";
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
