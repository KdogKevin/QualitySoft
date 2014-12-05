import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.Serializable;

/**
 * Class Main creates an empty contact list and then calls methods to add to the
 * contact list. It also prints out the contact list.
 */
public class Main {

	public static void main(String[] args) {
		ContactList allContacts;
		allContacts = load();

		/**
		 * Asks the user what action is needed to be done
		 */
		int menuChoice;

		do {
			menuChoice = getMenuInput();

			switch (menuChoice) {
			case 1:
				allContacts.createContact();
				break;
			case 2:
				allContacts.sort();
				System.out.println(allContacts);
				break;
			case 3:
				System.out.println("Enter a contact last name");
				System.out.println(allContacts
						.getContactByLastName(getNextInput()));
				break;
			case 4:
				System.out.println("Enter a contact email");
				System.out.println(allContacts
						.getContactByEmail(getNextInput()));

				break;
			case 5:
				System.out.println("Enter a contact zip");
				System.out.println(allContacts.getContactByZip(getNextInput()));

				break;
			case 0:
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
			System.out.println("A new Contact List has been opened.");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error in casting to ContactList: " + cnfe);
		}
		return readContactList;

	}

	/**
	 * This method writes the contactList to be used at a later time
	 */
	public static void save(ContactList newContactList) {

		FileOutputStream outFile;
		ObjectOutputStream outObject;
		try {
			outFile = new FileOutputStream("data");
			outObject = new ObjectOutputStream(outFile);
			outObject.writeObject(newContactList);
			outFile.close();
			outObject.close();
		} catch (IOException ioe) {
			System.out.println("Error writing objects to the file: "
					+ ioe.getMessage());
		}
		System.out.println("Contact List Saved.");
	}

	/**
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

	/**
	 * This method reads the next line the user inputs from the user.
	 */
	public static String getNextInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}

