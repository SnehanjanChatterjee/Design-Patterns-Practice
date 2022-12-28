package creational.factoryMethod.CourseDemo.Courses;

import creational.factoryMethod.CourseDemo.Modules.ConceptModule;
import creational.factoryMethod.CourseDemo.Modules.JavaModule;

public class LLD extends CourseFactoryImplementor {

	@Override
	public void createCourse() {
		modules.add(new ConceptModule());
		modules.add(new JavaModule());
	}

}
