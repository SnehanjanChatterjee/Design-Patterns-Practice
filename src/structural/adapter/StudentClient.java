package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
	public List<Student> getStudentList() {
		List<Student> students = new ArrayList<>();
		
		CollegeStudent collegeStudent = new CollegeStudent("Rahul", "Dravid", "Rahul.Dravid@gmail.com");
		SchoolStudent schoolStudent = new SchoolStudent("Sachin", "Tendulkar", "Sachin.Tendulkar@gmail.com");
		
		students.add(collegeStudent);
		
		// error as schoolStudent is not same as collegeStudent
		// students.add(schoolStudent);
		
		// fixed using adapter
		students.add(new SchoolStudentAdapter(schoolStudent));
		
		return students;
	}
}
