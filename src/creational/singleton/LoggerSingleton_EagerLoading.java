package creational.singleton;

public class LoggerSingleton_EagerLoading {
	private static LoggerSingleton_EagerLoading singleton = new LoggerSingleton_EagerLoading();

	private LoggerSingleton_EagerLoading() {
		if (singleton != null)
			throw new RuntimeException("Cannot access the constructor!");
	}

	public static LoggerSingleton_EagerLoading getSingleton() {
		return singleton;
	}

}
