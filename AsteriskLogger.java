package codingAssignment05;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String errorMessage = "***Error: " + error + "***";
		// create an asterisk header that fully covers the error message
		String astHeader = "";
		for (int i = 0; i < errorMessage.length(); i++) {
			astHeader += "*";
		}
		
		System.out.println(astHeader);
		System.out.println(errorMessage);
		System.out.println(astHeader);
	}

}
