package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

import behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
	
	public PassengerVehicle() {
		super(new NormalDriveStrategy());
	}
	
}