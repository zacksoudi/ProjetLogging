
public class Test {

	public static void main(String[] args) {
		/* Test Logger */
		Logger logger = new Logger(Test.class);
		/* Test Level */
		logger.setLevel(Level.DEBUG);
		 logger.addTarget(new Console());
		 logger.addTarget(new LogFile("C:\\Users\\zacksoudi\\workspace\\ProjetLogging\\monfichier.txt"));
		 
		logger.debug("Test log ESIEA : DEBUG");
		logger.info("Test log ESIEA : INFO");
		logger.error("Test log ESIEA : ERROR");
	}
}
