package creational.singleton;

public class Client {

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			LoggerSingleton_EagerLoading singletonObj = LoggerSingleton_EagerLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t1.start();
		
		Thread t2 = new Thread(() -> {
			LoggerSingleton_EagerLoading singletonObj = LoggerSingleton_EagerLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t2.start();
		
		Thread t3 = new Thread(() -> {
			LoggerSingleton_LazyLoading singletonObj = LoggerSingleton_LazyLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t3.start();
		
		Thread t4 = new Thread(() -> {
			LoggerSingleton_LazyLoading singletonObj = LoggerSingleton_LazyLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t4.start();
		
		Thread t5 = new Thread(() -> {
			LoggerSingleton_ThreadSafeLazyLoading singletonObj = LoggerSingleton_ThreadSafeLazyLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t5.start();
		
		Thread t6 = new Thread(() -> {
			LoggerSingleton_ThreadSafeLazyLoading singletonObj = LoggerSingleton_ThreadSafeLazyLoading.getSingleton();
			System.out.println(singletonObj);
		});
		t6.start();

	}

}
