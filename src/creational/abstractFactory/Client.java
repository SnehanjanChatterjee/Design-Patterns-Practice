package creational.abstractFactory;

import creational.abstractFactory.AdmitCard.AdmitCard;
import creational.abstractFactory.FeeCalculator.FeeCalculator;

public class Client {

	public static void main(String[] args) {
		int score = 90;
		UniversityAbstractFactory abstractFactoryOne = UniversityAbstractFactory.getUniversityFactory(score);
		for (String course : new String[]{"Math", "CS", "Physics"}) {
			System.out.print("For score: " + score + " & " + course);
			AdmitCard admitCard = abstractFactoryOne.getAdmitCard(course);
			System.out.print(", AdmitCard: " + admitCard.getClass());
			FeeCalculator feeCalculator = abstractFactoryOne.getFeeCalculator(course);
			System.out.println(", Fee: " + feeCalculator.calculateFee());
		}
		
		score = 120;
		UniversityAbstractFactory abstractFactoryTwo = UniversityAbstractFactory.getUniversityFactory(score);
		for (String course : new String[]{"Math", "CS", "Physics"}) {
			System.out.print("For score: " + score + " & " + course);
			AdmitCard admitCard = abstractFactoryTwo.getAdmitCard(course);
			System.out.print(", AdmitCard: " + admitCard.getClass());
			FeeCalculator feeCalculator = abstractFactoryTwo.getFeeCalculator(course);
			System.out.println(", Fee: " + feeCalculator.calculateFee());
		}

	}

}
