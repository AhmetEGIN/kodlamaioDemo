package kodlamaioDemo.core.Logging;

public class Loggers {
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger : loggers) {
			logger.log(message);
		}
	}
}
