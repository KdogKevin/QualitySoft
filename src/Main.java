import java.util.Scanner;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) {
		/* Call method to create contact list */
		// load();

		ContactList allContacts;
		allContacts = new ContactList();

		/*
		 * Asks the user what action is needed to be done
		 */
		int menuChoice;
		Scanner scan = new Scanner(System.in);
/*
		allContacts.createContact();
		System.out.println(allContacts);
		System.out.println("\n");
		allContacts.createContact();
		System.out.println(allContacts);
	*/	
		  Scanner kboard = new Scanner(System.in);
		  do{
		  System.out.println("---MENU---");
		  System.out.println("What would you like to do?");
		  System.out.println("1) Create a new contact "); System.out
		  .println("2) print sorted list of contacts");
		  System.out.println("3) Search for a contact by using a last name");
		  System.out.println("4) Search for a contact by using an email");
		  System.out.println("5) Search for a contact by using a zip code");
		  System.out.println("0) Quit"); System.out.print("-----> ");
		  menuChoice = scan.nextInt();
		  
		  switch(menuChoice){
		  case 1: allContacts.createContact();
		  System.out.println(allContacts);
		  break;
		  case 2: allContacts.sort();
		  System.out.println(allContacts);
		  break;
		  case 3: System.out.println("Enter a contact last name");
			  System.out.println(allContacts.getContactByLastName(scan.next()));
			  break;
		  case 4: System.out.println("Enter a contact email");
		  System.out.println(allContacts.getContactByEmail(scan.next()));
		  break;
		  case 5: System.out.println("Enter a contact zip");
		  System.out.println(allContacts.getContactByZip(scan.next()));
		  break;
		  case 0:// implement save method later
			  break;
		  }
		  
		  }while (menuChoice!=0);
		

		/*
		 * do
		 * 
		 * {
		 * 
		 * Scanner kboard = new Scanner(System.in);
		 * System.out.println("---MENU---");
		 * System.out.println("What would you like to do?");
		 * System.out.println("1) Create a new contact "); System.out
		 * .println("2) print sorted list of contacts");
		 * System.out.println("3) Search for a contact by using a last name");
		 * System.out.println("4) Search for a contact by using an email");
		 * System.out.println("5) Search for a contact by using a zip code");
		 * System.out.println("Q) Quit"); System.out.print("-----> ");
		 * menuChoice = scan.next();
		 * 
		 * if (menuChoice.equals("1")) {
		 */

		// allContacts.createContact();
		// } else if (menuChoice.equals("2")) {
		// allContacts.sort();

		// } else if (menuChoice.equals("3")) {

		// allContacts.getContactByLastName("");
		// } else if (menuChoice.equals("4")) {
		// allContacts.getContactByEmail("");

		// } else if (menuChoice.equals("5")) {
		// allContacts.getContactByZip("");

		/*
		 * }
		 * 
		 * } while (!menuChoice.equalsIgnoreCase("q"));
		 */

		// save();

	}

	/**
	 * This method reads a contactList that was saved on the disk
	 */
	public static void load() {
		System.out.println("Load called");
	}

	/**
	 * This method writes the contactList to be used at a later time
	 */
	public static void save() {
		System.out.println("Save called");
	}

}
/*
 * Load called In Constuctor ContactList In method createContact first and last
 * name assigned in constructor setName called setEmail called setPhone called
 * In streetAddress constructor setAddress called setNote called In method
 * createContact In method sort In method getContactByLastName In method
 * getContactByEmail In method getContactByZip Save called
 */
/*
What is the last name?
Jones
What is the first name?
Mary
What is the email
Maryjones@gmail.com
what is the phone number
650-955-5040
What is the House number
2222 Elm Street
What is the city 
Los Altos
What is the state
CA
What is the zip
94022
What is the country
USA
Do you want to enter a Note for the contact (Y/N)
Y
Please enter in the note.
Mary loves computer programming.

1)
Jones, Mary
2222 Elm Street
Los Altos, CA 94022 USA 
Maryjones@gmail.com
650-955-5040
Note: Mary loves computer programming.


What is the last name?
Smith
What is the first name?

What is the email
JohnSmith@apple.com
what is the phone number
555-555-5555
What is the House number
1309 Oak Street
What is the city 

What is the state
CA
What is the zip
94040
What is the country
USA
Do you want to enter a Note for the contact (Y/N)
n

1)
Jones, Mary
2222 Elm Street
Los Altos, CA 94022 USA 
Maryjones@gmail.com
650-955-5040
Note: Mary loves computer programming.
2)
Smith
1309 Oak Street
CA 94040 USA 
JohnSmith@apple.com
555-555-5555 
*/
