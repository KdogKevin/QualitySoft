/**
 * One object of Name stores the First and last name of a name Object
 */
public class Name {
	private String firstName;
	private String lastName;

	/**
	 * this constructs a Name object with given First and last names in
	 * parameters
	 */
	Name(String newFirstName, String newLastName) {
		// System.out.println("first and last name assigned in constructor");
		firstName = newFirstName;

		lastName = newLastName;
	}

	/**
	 * Set the firstName to the input newFirstName
	 */
	public void setFirstName(String newFirstName) {
		// only used if wants to change later
	}

	/**
	 * Set the lastName to the input newLastName
	 */
	public void setLastName(String newLastName) {
		// only used if wants to change later
	}

	/**
	 * This method returns the last name of the name
	 */
	public String getLastName() {

		return lastName;
	}

	/**
	 * This method returns the first name of the name
	 */
	public String getFirstName() {

		return firstName;
	}

	/**
	 * returns a formatted a name Object
	 */
	public String toString() {
		return lastName + ", " + firstName;
	}
}
