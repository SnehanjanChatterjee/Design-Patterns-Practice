package behavioral.strategy.ConceptAndCoding.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("sports drive");
	}

}
