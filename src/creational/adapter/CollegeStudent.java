package creational.adapter;

public class CollegeStudent implements Student {
	private String name;
	private String surName;
	private String email;

	public CollegeStudent(String name, String surName, String email) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurName() {
		return surName;
	}

	@Override
	public String getEmail() {
		return email;
	}

}
