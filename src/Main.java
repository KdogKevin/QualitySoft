import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This program Creates a contact list, that users can add to, save, sort,
 * print, and retrieve contacts by last name email and zip. users can save when they quit.
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
/*
A new Contact List has been opened.
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
smith
What is the first name?
john
What is the House number?
123 blackberry road
What is the city?
cupertino
What is the state?
ca
What is the zip?
95014
What is the country?
usa
What is the email
johnSmith@gmail.com
what is the phone number
4085556789
Do you want to enter a Note for the contact (Y/N)
n
Contact has been added.
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
smith
What is the first name?
bob
What is the House number?
12345
What is the city?
new youk
What is the state?
ca
What is the zip?
3145
What is the country?
USA
What is the email
smith@yahoo.com
what is the phone number
67905420983
Do you want to enter a Note for the contact (Y/N)
y
Please enter in the note.
this is a note
Contact has been added.
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
nguyen
What is the first name?
kev
What is the House number?
12345 blueJay lane
What is the city?

What is the state?
ca
What is the zip?

What is the country?
usa
What is the email
tester@gmail.com
what is the phone number
68943021
Do you want to enter a Note for the contact (Y/N)
n
Contact has been added.
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
jerry
What is the House number?
324241 lane
What is the city?
los gatos
What is the state?

What is the zip?
91234
What is the country?

What is the email
tester@gmail.com
what is the phone number
4567890987
Do you want to enter a Note for the contact (Y/N)
y
Please enter in the note.
this is a test note
Contact has been added.
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
trixy
What is the first name?
tang
What is the House number?
123534
What is the city?

What is the state?

What is the zip?
91234
What is the country?
usa
What is the email

what is the phone number

Do you want to enter a Note for the contact (Y/N)
n
Contact has been added.
---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 2

1)
nguyen, kev
12345 blueJay lane
ca usa 
tester@gmail.com
68943021

2)
smith, bob
12345
new youk, ca 3145 USA 
smith@yahoo.com
67905420983
Note: this is a note

3)
smith, john
123 blackberry road
cupertino, ca 95014 usa 
johnSmith@gmail.com
4085556789

4)
springer, jerry
324241 lane
los gatos 91234 
tester@gmail.com
4567890987
Note: this is a test note

5)
trixy, tang
123534
91234 usa 

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 3
Enter a contact last name
smith

smith, bob
12345
new youk, ca 3145 USA 
smith@yahoo.com
67905420983
Note: this is a note

smith, john
123 blackberry road
cupertino, ca 95014 usa 
johnSmith@gmail.com
4085556789

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 4
Enter a contact email
tester@gmail.com

nguyen, kev
12345 blueJay lane
ca usa 
tester@gmail.com
68943021

springer, jerry
324241 lane
los gatos 91234 
tester@gmail.com
4567890987
Note: this is a test note

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 5
Enter a contact zip
91234

springer, jerry
324241 lane
los gatos 91234 
tester@gmail.com
4567890987
Note: this is a test note

trixy, tang
123534
91234 usa 

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 3
Enter a contact last name
nonexistent
Contact is not in the contact list.

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 4
Enter a contact email
fakeEmail@yahoo.com
Contact is not in the contact list.

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 5
Enter a contact zip
98765
Contact is not in the contact list.

---MENU---
What would you like to do?
1) Create a new contact 
2) print sorted list of contacts
3) Search for a contact by using a last name
4) Search for a contact by using an email
5) Search for a contact by using a zip code
0) Quit
-----> 0
Contact List Saved.
 */

