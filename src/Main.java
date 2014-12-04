import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.Serializable;

/*
 * Class Main creates an empty contact list and then calls methods to add to the contact list.  It also
 * prints out the contact list.
 */
public class Main {

	public static void main(String[] args) {
		/* Call method to create contact list */
		ContactList allContacts;
		allContacts = new ContactList();
		allContacts= null;
		allContacts = load();
		System.out.println("Printing out the loaded Contact list");
		System.out.println(allContacts);

		/*
		 * Asks the user what action is needed to be done
		 */
		int menuChoice;
		
		do {
			menuChoice = getMenuInput();

			switch (menuChoice) {
			case 1:
				allContacts.createContact();
				System.out.println(allContacts);
				break;
			case 2:
				allContacts.sort();
				System.out.println(allContacts);
				break;
			case 3:
				System.out.println("Enter a contact last name");
				// System.out.println(allContacts.getContactByLastName(scan.next()));
				 System.out.println(allContacts.getContactByLastName(getNextInput()));
				break;
			case 4:
				System.out.println("Enter a contact email");
				// System.out.println(allContacts.getContactByEmail(scan.next()));
				 System.out.println(allContacts.getContactByEmail(getNextInput()));

				break;
			case 5:
				System.out.println("Enter a contact zip");
				// System.out.println(allContacts.getContactByZip(scan.next()));
				 System.out.println(allContacts.getContactByZip(getNextInput()));

				break;
			case 0:
				// implement save method later
				save(allContacts);
				break;
			}

		} while (menuChoice != 0);

	}

	/**
	 * This method reads a contactList that was saved on the disk and returns a
	 * ContactList.
	 */
	public static ContactList load() {
		System.out.println("Load called");
		 ContactList readContactList;
		 readContactList = new ContactList();
		FileInputStream inFile;
		ObjectInputStream inObject;
		try {
			inFile = new FileInputStream("data");
			inObject = new ObjectInputStream(inFile);
			readContactList = (ContactList) inObject.readObject();
			inFile.close();
			inObject.close();
		} catch (IOException ioe) {
			System.out.println("Error reading from the file: "
					+ ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to ContactList: " + cnfe);
		}
		System.out.println(readContactList);
		return readContactList;

		/*
		 * ContactList testLoadContacts; testLoadContacts = new ContactList();
		 * return testLoadContacts;
		 */
	}

	/**
	 * This method writes the contactList to be used at a later time
	 */
	public static void save(ContactList newContactList) {
		System.out.println("Save called");
		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			System.out.println(newContactList);
			outObject.writeObject(newContactList);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: "
					+ ioe.getMessage());
		}
		System.out.println("test out the write file by loading it again.");
		ContactList testallContacts;
		//testallContacts = new ContactList();
		testallContacts = load();
		System.out.println("Printing out the loaded Contact list");
		System.out.println(testallContacts);
	}
/*
 * this method prints a menu and gets the menu input from the user.
 */
	public static int getMenuInput() {
		Scanner kboard = new Scanner(System.in);

		System.out.println("---MENU---");
		System.out.println("What would you like to do?");
		System.out.println("1) Create a new contact ");
		System.out.println("2) print sorted list of contacts");
		System.out.println("3) Search for a contact by using a last name");
		System.out.println("4) Search for a contact by using an email");
		System.out.println("5) Search for a contact by using a zip code");
		System.out.println("0) Quit");
		System.out.print("-----> ");
		return kboard.nextInt();
	}
	/*
	 * This method reads the next line the user inputs from the user.
	 */
	public static String getNextInput(){
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}
/*
Load called

Printing out the loaded Contact list

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 1
What is the last name?
springer
What is the first name?
michael
What is the email

what is the phone number

What is the House number

What is the city 

What is the state

What is the zip

What is the country

Do you want to enter a Note for the contact (Y/N)
n


1)
springer, michael
 
---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 0
Save called
just did FileOutputStream
just did ObjectOutputStream


1)
springer, michael
 
test out the write file by loading it again.
Load called


1)
springer, michael
 
Printing out the loaded Contact list


1)
springer, michael
 */
