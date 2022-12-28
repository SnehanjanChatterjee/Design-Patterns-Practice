package behavioral.strategy.ConceptAndCoding.WithoutStrategyPattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("WithoutStrategyPattern");
		Vehicle vehicle1 = new SportsVehicle();
		vehicle1.drive();
		
		Vehicle vehicle2 = new GoodsVehicle();
		vehicle2.drive();
	}

}
