

public class ContactList {
	private int FINAL_LIST_SIZE=10;
/*Create an array of Contacts*/
	ContactList(){
		/*Constructor for ContactList where we will create the contactList array that stores
		 * employee objects
		 */
		System.out.println("In Constuctor ContactList");
	}
	
	void createContact(){
		/*contact = new Contact() 
		 * Take input from user and store it an employee object. Once conditions are satisfied, it can be stored
		 * in the contactList array.
		 */
		System.out.println("In method createContact");

	}
	void getListByLastNameAlpha(){
		/* Will resort the contact list to be alphabetical order by last name.*/
		/*Do we want this to return anything?  Can we return an array? */
		System.out.println("In method getListByLastNameAlpha");
	}
	
	String ToString () {
		/*
		 * Returns in string format the values of the contactList array 
		 */
		System.out.println("In method toString");
		return "";
	}
	
	Contact getContactByLastName (String parLastName) {
		/*Use the parameter passed to compare it to last names in the contact list to check and see if it matches
		 * any names in the contactList array.  If it does, retrieve the information.
		 */
		Contact m = new Contact();
		return m; 
	}
	Contact getContactByEmail (String parEmail) {
		/*Use the parameter passed to compare it to email in the contact list to check and see if it matches
		 * any emails in the contactList array.  If it does, retrieve the information.
		 */
		Contact m = new Contact();
		return m; 
	}
	Contact getContactByZip (String parZip) {
		/*Use the parameter passed to compare it to Zip in the contact list to check and see if it matches
		 * any Zip in the contactList array.  If it does, retrieve the information.
		 */
		Contact m = new Contact();
		return m; 
	}
}
