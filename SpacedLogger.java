package codingAssignment05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String spacedString = "";						// instantiate the string placeholder
		for (int i = 0; i < (log.length()-1); i++) {	// loop through all but the last chars
			// use += to concatenate the new string
			// .concat does not works for .charAt as it can't convert from char to String
			spacedString += log.charAt(i) + " ";		// add a space between all chars except the last
		}
		spacedString += log.charAt(log.length()-1);		// add the last char
		System.out.println(spacedString);				// print the new string to the console
	}

	@Override
	public void error(String error) {
		String errorString = "ERROR:";							// instantiate the string placeholder
		for (int i = 0; i < error.length(); i++) {				// loop through the chars in the String
			errorString += " " + error.charAt(i);				// add a space before each new char
		}
		System.out.println(errorString);
	}
	

}
