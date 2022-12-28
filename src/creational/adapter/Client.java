package creational.adapter;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		StudentClient client = new StudentClient();
		List<Student> students = client.getStudentList();
		
		for (Student student : students) {
			System.out.println(student.getName() + " " + student.getSurName() + " " + student.getEmail());
		}
	}

}
