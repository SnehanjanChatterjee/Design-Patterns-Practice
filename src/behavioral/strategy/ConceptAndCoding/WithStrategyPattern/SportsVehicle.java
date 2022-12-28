package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

import behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
