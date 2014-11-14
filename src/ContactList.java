import java.util.Scanner;

/**
 * One object of this class creates an array of contact objects
 *
 */

public class ContactList {
	private int FINAL_LIST_SIZE = 10;
	private Scanner scan = new Scanner(System.in);

	/**
	 * Constructor for ContactList where we will create the contactList array
	 * that stores contact objects
	 */
	ContactList() {

		System.out.println("In Constuctor ContactList");
	}

	/**
	 * Prompts user to enter contact info and then stores the new contact into a
	 * free position in the ContactList
	 * 
	 */
	public void createContact() {
		System.out.println("In method createContact");

		Contact x = new Contact();

		// System.out.println("what is your first name?");
		// String firstnName =scan.next();
		// String lastname= scan.next();

		Name contactName;
		contactName = new Name("", "");// firstName , lastName in para
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
	 * Sorts the ContactList by last name, then returns the temporary
	 * contactList
	 */
	public ContactList getListByLastNameAlpha() {
		/* Will resort the contact list to be alphabetical order by last name. */

		System.out.println("In method getListByLastNameAlpha");
		return null;
	}

	/**
	 * Returns the Contact list in string format
	 */
	public String ToString() {
		/*
		 * Returns in string format the values of the contactList array
		 */
		System.out.println("In method toString");
		return "";
	}

	/**
	 * Compares the last Name that was input to the last names in the current
	 * contact list, then returns the contact with the input last name
	 */
	public Contact getContactByLastName(String parLastName) {
		/*
		 * Use the parameter passed to compare it to last names in the contact
		 * list to check and see if it matches any names in the contactList
		 * array. If it does, retrieve the information.
		 */
		System.out.println("In method getContactByLastName");
		Contact m = new Contact();
		return m;
	}

	/**
	 * Compares the email that was input to the email in the current contact
	 * list, then returns the contact with the input email
	 */
	public Contact getContactByEmail(String parEmail) {
		/*
		 * Use the parameter passed to compare it to email in the contact list
		 * to check and see if it matches any emails in the contactList array.
		 * If it does, retrieve the information.
		 */
		System.out.println("In method getContactByEmail");
		Contact m = new Contact();
		return m;
	}

	/**
	 * Compares the zip code that was input to the zip code in the current
	 * contact list, then returns the contact with the input zip code
	 */
	public Contact getContactByZip(String parZip) {
		/*
		 * Use the parameter passed to compare it to Zip in the contact list to
		 * check and see if it matches any Zip in the contactList array. If it
		 * does, retrieve the information.
		 */
		System.out.println("In method getContactByZip");
		Contact m = new Contact();
		return m;
	}
}
