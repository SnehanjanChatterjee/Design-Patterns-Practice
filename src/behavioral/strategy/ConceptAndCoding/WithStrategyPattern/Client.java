package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

public class Client {

	public static void main(String[] args) {
		System.out.println("WithStrategyPattern");
		Vehicle vehicle1 = new SportsVehicle();
		vehicle1.drive();
		
		Vehicle vehicle2 = new GoodsVehicle();
		vehicle2.drive();
	}

}
