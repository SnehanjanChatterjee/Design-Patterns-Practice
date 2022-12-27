package creational.factoryMethod;

import creational.factoryMethod.Courses.CourseFactoryImplementor;

public class ClientClass {

	public static void main(String[] args) {
		CourseFactoryImplementor hldCourses = CourseFactory.getCourse("HLD");
		CourseFactoryImplementor lldCourses = CourseFactory.getCourse("LLD");
		
		System.out.println("HLD Courses: " + hldCourses.modules);
		System.out.println("LLD Courses: " + lldCourses.modules);

	}

}
