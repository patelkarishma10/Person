
public class Runner {

	public static void main(String[] args) {

		Person p = new Person("p", 21, "engineer");
		Person a = new Person("a", 21, "engineer");
		Person b = new Person("a", 22, "engineer");
		PersonManager pm1 = new PersonManager();
		pm1.getpeople().add(p);
		pm1.getpeople().add(a);
		pm1.getpeople().add(b);

		System.out.println(p);
		System.out.println(a);
		System.out.println(pm1.getpeople());
		pm1.searchForName("a");

	}

}
