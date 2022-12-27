package creational.factoryMethod.Courses;

import creational.factoryMethod.Modules.ConceptModule;
import creational.factoryMethod.Modules.JavaModule;

public class LLD extends CourseFactoryImplementor {

	@Override
	public void createCourse() {
		modules.add(new ConceptModule());
		modules.add(new JavaModule());
	}

}
