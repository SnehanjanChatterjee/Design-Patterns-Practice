package creational.factoryMethod.Courses;

import java.util.ArrayList;
import java.util.List;
import creational.factoryMethod.Modules.Module;

public abstract class CourseFactoryImplementor {
	public List<Module> modules = new ArrayList<Module>();

	public CourseFactoryImplementor() {
		createCourse();
	}

	public abstract void createCourse();

}
