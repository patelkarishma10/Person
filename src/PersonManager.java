import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonManager {
	private ArrayList<Person> people = new ArrayList<Person>();
	// public Person employee;

	/*
	 * public void createList() { people.add(employee);
	 * System.out.println(people.get(0));
	 * 
	 * }
	 */

	public void searchForName(String name) {
		List<Person> searchedName = people.stream().filter(p -> name.equals(p.getName())).collect(Collectors.toList());
		System.out.println(searchedName);
	}

	public void setpeople(ArrayList<Person> people) {
		this.people = people;
	}

	public ArrayList<Person> getpeople() {
		return people;
	}

}
