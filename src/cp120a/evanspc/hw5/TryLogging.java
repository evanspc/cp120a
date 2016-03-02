package cp120a.evanspc.hw5;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TryLogging {


	public static void main(String[] args) throws SecurityException, IOException {
		TryLogging tl = new TryLogging();
		FileHandler fileHandler = new FileHandler("cp120a_evanspc_hw5_log.xml");
		ConsoleHandler consoleHandler = new ConsoleHandler();
		logger.addHandler(fileHandler);
		logger.addHandler(consoleHandler);
		logger.setLevel(Level.ALL);
		fileHandler.setLevel(Level.ALL);
		logger.setUseParentHandlers(false);
		consoleHandler.setLevel(Level.ALL);
		tl.doIt();

	}

	private static final Logger logger = Logger.getLogger("hw5");//hw5 is way of naming

	private void doIt() {
		logger.entering("TryLogging", "doIt");
		logger.info("I am in doIt");
		try
		{
			throw new Exception("thrown exception in try in doIt");
		}catch (Exception e){
			logger.throwing(this.getClass().getName(), "doIt", e);
		}
		logger.exiting("TryLogging", "doIt");

	}

}
