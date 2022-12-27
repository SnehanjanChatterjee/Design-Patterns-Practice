package creational.factoryMethod.Courses;

import creational.factoryMethod.Modules.CPPModule;
import creational.factoryMethod.Modules.IntroModule;

public class HLD extends CourseFactoryImplementor {

	@Override
	public void createCourse() {
		modules.add(new IntroModule());
		modules.add(new CPPModule());
	}

}
