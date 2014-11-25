import java.util.Scanner;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.Serializable;
public class Main {

	public static void main(String[] args) {
		/* Call method to create contact list */
		//load();
		
		ContactList allContacts;
		allContacts = new ContactList();

		/*
		 * Asks the user what action is needed to be done
		 */
		String menuChoice;
		Scanner scan = new Scanner(System.in);
		
		
		allContacts.createContact();
		System.out.println(allContacts);
		allContacts.createContact();
		System.out.println(allContacts);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*	do

		{

			Scanner kboard = new Scanner(System.in);
			System.out.println("---MENU---");
			System.out.println("What would you like to do?");
			System.out.println("1) Create a new contact ");
			System.out
					.println("2) print sorted list of contacts");
			System.out.println("3) Search for a contact by using a last name");
			System.out.println("4) Search for a contact by using an email");
			System.out.println("5) Search for a contact by using a zip code");
			System.out.println("Q) Quit");
			System.out.print("-----> ");
			menuChoice = scan.next();

			if (menuChoice.equals("1")) { */

				//allContacts.createContact();
		//	} else if (menuChoice.equals("2")) {
				//allContacts.sort();
				

		//	} else if (menuChoice.equals("3")) {

				//allContacts.getContactByLastName("");
		//	} else if (menuChoice.equals("4")) {
				//allContacts.getContactByEmail("");

		//	} else if (menuChoice.equals("5")) {
				//allContacts.getContactByZip("");

		/*	}

		} while (!menuChoice.equalsIgnoreCase("q")); */

				//save();

	}
	/**
	 * This method reads a contactList that was saved on the disk
	 */
	public static void load(){
		System.out.println("Load called");
	}
	/**
	 * This method writes the contactList to be used at a later time
	 */
	public static void save(){
		System.out.println("Save called");
	}

}
/*
Load called
In Constuctor ContactList
In method createContact
first and last name assigned in constructor
setName called
setEmail called
setPhone called
In streetAddress constructor
setAddress called
setNote called
In method createContact
In method sort
In method getContactByLastName
In method getContactByEmail
In method getContactByZip
Save called
 */

