package creational.factoryMethod;

import creational.factoryMethod.Courses.CourseFactoryImplementor;

// https://www.youtube.com/watch?v=s3Wr5_tsODs&list=PLTCrU9sGybupCpY20eked6blbHI4zZ55k&index=12
public class ClientClass {

	public static void main(String[] args) {
		CourseFactoryImplementor hldCourses = CourseFactory.getCourse("HLD");
		CourseFactoryImplementor lldCourses = CourseFactory.getCourse("LLD");
		
		System.out.println("HLD Courses: " + hldCourses.modules);
		System.out.println("LLD Courses: " + lldCourses.modules);

	}

}
