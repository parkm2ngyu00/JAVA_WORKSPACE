
public class MainTest {

	public static void main(String[] args) {
		Person p1 = new Person("Park", 10);
		Person p2 = new Person("Park", 10);
		if (p1 == p2)
			System.out.println("p1 == p2");
		else
			System.out.println("p1 != p2");
		if (p1.equals(p2)) // Person class need equals method overriding
			System.out.println("p1 equals p2");
		else
			System.out.println("p1 not equals p2");
		
		String s1 = "Park"; // String literal uses String Pool
		String s2 = "Park";
		if (s1 == s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		String str1 = new String("Park"); // String
		String str2 = new String("Park");
		if (str1 == str2)
			System.out.println("str1 == str2");
		else
			System.out.println("str1 != str2");
	}

}
