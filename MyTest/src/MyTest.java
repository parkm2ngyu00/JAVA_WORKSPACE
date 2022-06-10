import java.util.*;

public class MyTest {
	
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.addElement("ABC");
		v1.addElement("DEF");
		v1.addElement("GHI");
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println("" + v1.elementAt(i));
		}
		
		Enumeration<String> e = v1.elements();
		while (e.hasMoreElements()) {
			System.out.println("" + e.nextElement());
		}
	}

}
