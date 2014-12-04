import java.io.Serializable;

/**
 * One object of a StreetAddress stores the information for an address
 *
 */
public class StreetAddress implements Serializable  {
	private String house;
	private String city;
	private String state;
	private String zip;
	private String country;

	/**
	 * constructs a street address object
	 */
	public StreetAddress() {
		// System.out.println("In streetAddress constructor");

		// assign users input to data members
	}

	/**
	 * Sets the house data member to the parameter newHouse
	 */
	public void setHouse(String newHouse) {
		house = newHouse;

	}

	/**
	 * Sets the city data member to the parameter newCity
	 */
	public void setCity(String newCity) {
		city = newCity;

	}

	/**
	 * Sets the state data member to the parameter newState
	 */
	public void setState(String newState) {
		state = newState;

	}

	/**
	 * Sets the zip data member to the parameter newZip
	 */
	public void setZip(String newZip) {
		zip = newZip;

	}

	/**
	 * Sets the country data member to the parameter newCountry
	 */
	public void setCountry(String newCountry) {
		country = newCountry;
	}

	/**
	 * returns a formatted string object of the StreetAddress
	 */
	public String toString() {
		String tempString = "";
		// return house + "\n" + city + ", " + state + " " + zip + "\n" +
		// country;
		if (!(house.equals(""))) {
			tempString = tempString + house + "\n";
		}
		if (!(city.equals(""))) {
			if (!(state.equals(""))) {
				// System.out.println("State is " + state);
				tempString = tempString + city + ", " + state + " ";
			} else {
				// System.out.println("State is " + state);
				tempString = tempString + city + " ";
			}
		} else {

			tempString = tempString + state + " ";
		}
		if (!(zip.equals(""))) {
			tempString = tempString + zip + " ";
		}
		if (!(country.equals(""))) {
			tempString = tempString + country + " ";
		}
		return tempString;
	}
	/* Include methods to set all of the variables for all of the address */

}
