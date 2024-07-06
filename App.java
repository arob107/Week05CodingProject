package codingAssignment05;

public class App {

	static Logger spaceLogger;
	static Logger astLogger;
	
	public static void main(String[] args) {
		
		// instantiate the AsteriskLogger Class
		Logger astLogger = new AsteriskLogger();
		// instantiate the log method
		astLogger.log("Effective");
		System.out.println("\n");
		// instantiate the error method
		astLogger.error("SupperDupper");
		System.out.println("\n");
		
		// instantiate the SpacedLogger Class
		Logger spaceLogger = new SpacedLogger();
		// instantiate the log method
		spaceLogger.log("Ambiguous");
		System.out.println("\n");
		// instantiate the error method
		spaceLogger.error("Ambiguous");
		System.out.println("\n");

	} // end of main

}
