package cp120a.evanspc.hw7;

import java.io.IOException;
import java.util.logging.*;

public class TryLogging {

	public static void main(String[] args) throws SecurityException, IOException {
		TryLogging tl = new TryLogging();
		FileHandler fileHandler = new FileHandler("myLogFile.txt");
		ConsoleHandler consoleHandler = new ConsoleHandler();
		logger.addHandler(fileHandler);
		logger.addHandler(consoleHandler);
		logger.setLevel(Level.ALL);
		logger.setUseParentHandlers(false);
		fileHandler.setLevel(Level.ALL);
		consoleHandler.setLevel(Level.ALL);
		tl.doIt();

	}

	private static final Logger logger =Logger.getLogger("cp120a.instructor.ch07");
	

	public void doIt() {
		logger.entering("TryLogging", "doIt");
		logger.info("I am in doing");
		try {
			throw new Exception("happens at doIt");
		} catch (Exception e) {
			logger.throwing(this.getClass().getName(), "doIt", e);
			logger.warning(e.getMessage());
		}
		logger.exiting("TryLogging", "doIt");
		
	}

}

