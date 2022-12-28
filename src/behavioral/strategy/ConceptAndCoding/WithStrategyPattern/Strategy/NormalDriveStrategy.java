package behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("normal dive");
	}

}
