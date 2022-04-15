package revature.loggingExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		logger.trace("Tracing? What does that mean?\n");
		logger.debug("Debugging now!\n");
		logger.info("This is some information for the user\n");
		logger.warn("Warning! This may create an error\n");
		logger.error("You've just made an error sir\n");
		logger.fatal("You've not only made an error, you've also crashed your whole program\n");

	}
}
