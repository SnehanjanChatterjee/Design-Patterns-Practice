package creational.abstractFactory.Factory;

import creational.abstractFactory.UniversityAbstractFactory;
import creational.abstractFactory.AdmitCard.AdmitCard;
import creational.abstractFactory.AdmitCard.CaltechTechAdmitCard;
import creational.abstractFactory.AdmitCard.GeogiaTechAdmitCard;
import creational.abstractFactory.AdmitCard.MITAdmitCard;
import creational.abstractFactory.FeeCalculator.CaltechFeeCalculator;
import creational.abstractFactory.FeeCalculator.FeeCalculator;
import creational.abstractFactory.FeeCalculator.GeorgiaFeeCalculator;
import creational.abstractFactory.FeeCalculator.MITFeeCalculator;

public class IvyLeagueUniversityFactory extends UniversityAbstractFactory {
	@Override
	public AdmitCard getAdmitCard(String course) {
		switch (course) {
		case "CS": {
			return new GeogiaTechAdmitCard();
		}
		case "Math": {
			return new MITAdmitCard();
		}
		case "Physics": {
			return new CaltechTechAdmitCard();
		}
		default:
			break;
		}
		return null;
	}

	@Override
	public FeeCalculator getFeeCalculator(String course) {
		switch (course) {
		case "CS": {
			return new GeorgiaFeeCalculator();
		}
		case "Math": {
			return new MITFeeCalculator();
		}
		case "Physics": {
			return new CaltechFeeCalculator();
		}
		default:
			break;
		}
		return null;
	}
}
