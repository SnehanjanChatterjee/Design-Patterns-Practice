package creational.factoryMethod;

import creational.factoryMethod.Courses.CourseFactoryImplementor;
import creational.factoryMethod.Courses.HLD;
import creational.factoryMethod.Courses.LLD;

public class CourseFactory {

	public static CourseFactoryImplementor getCourse(String courseType) {
		switch (courseType) {
		case "HLD": {
			return new HLD();
		}
		case "LLD": {
			return new LLD();
		}
		default:
			return null;
		}
	}

}
