import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Call method to create contact list */
		ContactList allContacts;
		allContacts = new ContactList();
		
		Scanner userInput= new Scanner(System.in);
		/*
		 * Asks the user what action is needed to be done
		 */
		do {
			/*
			 * Create Menu to allows users to choose what they want to do: 
			 * 1. Enter a new contact 
			 * 2. Print the Contact List sorted by last name 
			 * 3. Retrieve a Contact by last name 
			 * 4. Retrieve a Contact by email 
			 * 5. Retrieve a Contact by zip 
			 * q. quit
			 */

			
			//test 
			if (userInput == '1') {

				// allContacts.createContact();
			} else if (userInput == '2') {
				//System.out.println(getListByLastNameAlpha());

			} else if (userInput == '3') {

				//allContact.getContactByLastName();
			} else if (userInput == '4') {
				//allContact.getContactByEmail();

			} else if (userInput == '5') {
				//allContact.getContactByZip();

			}

		} while (userinput != 'q');
	}

	

}


/* FAKE RECORDING
 */
