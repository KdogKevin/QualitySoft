import java.io.Serializable;

/**
 * One object of a StreetAddress stores the information for an address
 * 
 */
public class StreetAddress implements Serializable {
	private static final long serialVersionUID = 1L;
	private String house;
	private String city;
	private String state;
	private String zip;
	private String country;

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
	 * This method returns the zip of the object StreetAddress
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * returns a formatted string object of the StreetAddress
	 */
	public String toString() {
		String tempString = "";
		if (!(house.equals(""))
				&& ((!city.equals("") || (!state.equals(""))
						|| (!zip.equals("")) || (!country.equals(""))))) {
			tempString = tempString + house + "\n";
		} else if (!(house.equals(""))) {
			tempString = tempString + house;
		}
		if (!(city.equals(""))) {
			if (!(state.equals(""))) {
				tempString = tempString + city + ", " + state + " ";
			} else {
				tempString = tempString + city + " ";
			}
		} else {
			if (!(state.equals(""))) {
				tempString = tempString + state + " ";
			}
		}
		if (!(zip.equals(""))) {
			tempString = tempString + zip + " ";
		}
		if (!(country.equals(""))) {
			tempString = tempString + country + " ";
		}
		return tempString;
	}

}
