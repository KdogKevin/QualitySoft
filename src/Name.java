import java.io.Serializable;

/**
 * One object of Name stores the First and last name of a name Object
 */
public class Name implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;

	/**
	 * this constructs a Name object with given First and last names in
	 * parameters
	 */
	public Name(String newFirstName, String newLastName) {
		firstName = newFirstName;
		lastName = newLastName;
	}

	/**
	 * Set the firstName to the input newFirstName
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Set the lastName to the input newLastName
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
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
