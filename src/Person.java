
public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public String details() {
		// System.out.println("Name: " + name + "\n" + "Age: " + age + "\n" + "Job
		// title: " + jobTitle);
		return name + " " + age + "" + jobTitle;
	}

	public String toString() {

		return name + " " + age + " " + jobTitle;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setName(String Name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
