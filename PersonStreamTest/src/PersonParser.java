import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.UnknownFormatConversionException;

public class PersonParser {
	public Person parse(String[] items) {
		//System.out.println("PersonParser::parse" + Arrays.toString(items));
		try {
			String name = items[0]; // String
			int age = Integer.parseInt(items[1]); // String->int
			double weight = Double.parseDouble(items[2]); // String->double
			double height = Double.parseDouble(items[3]); // String->double
			Gender gender = Gender.valueOf(items[4]); // String->Gender
			return new Person(name, age, weight, height, gender);		
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (UnknownFormatConversionException e) {
			System.out.println("UnknownFormatConversionException");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		} 
		return null;
	}
}
