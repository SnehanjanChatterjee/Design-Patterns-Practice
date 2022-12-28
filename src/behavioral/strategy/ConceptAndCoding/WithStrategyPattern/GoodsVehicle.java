package behavioral.strategy.ConceptAndCoding.WithStrategyPattern;

import behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

	public GoodsVehicle() {
		super(new NormalDriveStrategy());
	}
}
