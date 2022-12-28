package creational.abstractFactory.Factory;

import creational.abstractFactory.UniversityAbstractFactory;
import creational.abstractFactory.AdmitCard.ASUTechAdmitCard;
import creational.abstractFactory.AdmitCard.AdmitCard;
import creational.abstractFactory.AdmitCard.CaltechTechAdmitCard;
import creational.abstractFactory.AdmitCard.GeogiaTechAdmitCard;
import creational.abstractFactory.AdmitCard.MITAdmitCard;
import creational.abstractFactory.AdmitCard.USCAdmitCard;
import creational.abstractFactory.AdmitCard.VSUAdmitCard;
import creational.abstractFactory.FeeCalculator.ASUFeeCalculator;
import creational.abstractFactory.FeeCalculator.FeeCalculator;
import creational.abstractFactory.FeeCalculator.USCFeeCalculator;
import creational.abstractFactory.FeeCalculator.VSUFeeCalculator;

public class PublicUniversityFactory extends UniversityAbstractFactory {

	@Override
	public AdmitCard getAdmitCard(String course) {
		switch (course) {
		case "CS": {
			return new ASUTechAdmitCard();
		}
		case "Math": {
			return new USCAdmitCard();
		}
		case "Physics": {
			return new VSUAdmitCard();
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
			return new ASUFeeCalculator();
		}
		case "Math": {
			return new USCFeeCalculator();
		}
		case "Physics": {
			return new VSUFeeCalculator();
		}
		default:
			break;
		}
		return null;
	}

}
