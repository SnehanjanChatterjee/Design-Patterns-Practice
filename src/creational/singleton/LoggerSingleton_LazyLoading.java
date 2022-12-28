package creational.singleton;

public class LoggerSingleton_LazyLoading {
	private static LoggerSingleton_LazyLoading singleton = null;

	private LoggerSingleton_LazyLoading() {
		if (singleton != null)
			throw new RuntimeException("Cannot access the constructor!");
	}

	public static LoggerSingleton_LazyLoading getSingleton() {
		if (singleton == null) {
			singleton = new LoggerSingleton_LazyLoading();
		}
		return singleton;
	}

}
