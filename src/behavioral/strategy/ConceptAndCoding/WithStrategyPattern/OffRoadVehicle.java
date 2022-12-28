package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

import behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

	public OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
