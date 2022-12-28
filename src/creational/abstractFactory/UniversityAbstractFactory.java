package creational.abstractFactory;

import creational.abstractFactory.AdmitCard.AdmitCard;
import creational.abstractFactory.Factory.IvyLeagueUniversityFactory;
import creational.abstractFactory.Factory.PublicUniversityFactory;
import creational.abstractFactory.FeeCalculator.FeeCalculator;

public abstract class UniversityAbstractFactory {
	private static int cutoff = 100;

	public static UniversityAbstractFactory getUniversityFactory(int score) {
		if (score > cutoff)
			return new IvyLeagueUniversityFactory();
		else
			return new PublicUniversityFactory();
	}

	public abstract AdmitCard getAdmitCard(String course);

	public abstract FeeCalculator getFeeCalculator(String course);
}
