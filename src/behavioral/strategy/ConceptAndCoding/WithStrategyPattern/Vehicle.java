package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

import behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
	DriveStrategy driveStrategy;

	public Vehicle(DriveStrategy driveStrategy) {
		super();
		this.driveStrategy = driveStrategy;
	}

	public void drive() {
		this.driveStrategy.drive();
	}
}
