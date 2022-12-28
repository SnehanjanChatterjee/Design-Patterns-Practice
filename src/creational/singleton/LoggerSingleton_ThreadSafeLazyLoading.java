package creational.singleton;

public class LoggerSingleton_ThreadSafeLazyLoading {
	private static volatile LoggerSingleton_ThreadSafeLazyLoading singleton = null;

	private LoggerSingleton_ThreadSafeLazyLoading() {
		if (singleton != null)
			throw new RuntimeException("Cannot access the constructor!");
	}

	public static LoggerSingleton_ThreadSafeLazyLoading getSingleton() {
		if (singleton == null) {
			synchronized (LoggerSingleton_ThreadSafeLazyLoading.class) {
				if (singleton == null) {
					singleton = new LoggerSingleton_ThreadSafeLazyLoading();
				}
			}
		}
		return singleton;
	}

}
