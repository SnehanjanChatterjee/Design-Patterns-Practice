package creational.factoryMethod.CourseDemo;

import creational.factoryMethod.CourseDemo.Courses.CourseFactoryImplementor;
import creational.factoryMethod.CourseDemo.Courses.HLD;
import creational.factoryMethod.CourseDemo.Courses.LLD;

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
