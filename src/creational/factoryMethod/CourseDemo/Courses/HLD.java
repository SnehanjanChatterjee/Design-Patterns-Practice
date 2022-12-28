package creational.factoryMethod.CourseDemo.Courses;

import creational.factoryMethod.CourseDemo.Modules.CPPModule;
import creational.factoryMethod.CourseDemo.Modules.IntroModule;

public class HLD extends CourseFactoryImplementor {

	@Override
	public void createCourse() {
		modules.add(new IntroModule());
		modules.add(new CPPModule());
	}

}
