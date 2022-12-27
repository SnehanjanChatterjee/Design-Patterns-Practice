package creational.builder;

// https://www.youtube.com/watch?v=4ff_KZdvJn8&list=PLTCrU9sGybupCpY20eked6blbHI4zZ55k&index=13
public class ClientClass {
	public static void main(String[] args) {
		URLBuilder.Builder builder1 = new URLBuilder.Builder();
		builder1.protocol("https://").hostName("newwebsite:").port("4434");
		URLBuilder urlBuilder1 = builder1.build();
		System.out.print(urlBuilder1.protocol);
		System.out.print(urlBuilder1.hostName);
		System.out.println(urlBuilder1.port);
		
		URLBuilder.Builder builder2 = new URLBuilder.Builder();
		builder2.protocol("https://").hostName("newwebsite:").pathParam("/dwf");
		URLBuilder urlBuilder2 = builder2.build();
		System.out.print(urlBuilder2.protocol);
		System.out.print(urlBuilder2.hostName);
		System.out.println(urlBuilder2.pathParam);
	}
}
