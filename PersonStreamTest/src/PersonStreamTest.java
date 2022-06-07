import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonStreamTest {

	static void load(String filename) {
		// load PersonList.csv using FileInputStream
		FileInputStream fis = null;
		try {
			System.out.println("filename=" + filename);
			fis = new FileInputStream(filename);
			int c = 0;
			while ((c = fis.read()) != -1) {
				System.out.print((char)c);
			}
			fis.close();
			System.out.println("\nload successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void load2(String filename) {
		// load PersonList.csv using BufferedReader
		FileReader fr = null;
		BufferedReader br = null;
		try {
			System.out.println("filename=" + filename);
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
			System.out.println("\nload successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static List<Person> load3(String filename) {
		List<Person> list = new ArrayList<>();
		// load PersonList.csv using BufferedReader
		FileReader fr = null;
		BufferedReader br = null;
		try {
			System.out.println("filename=" + filename);
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				String[] items = line.split(",");
				Person person = new PersonParser().parse(items);
				list.add(person);
				//System.out.println(person);
			}
			br.close();
			fr.close();
			System.out.println("\nload successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) {
		load("PersonList.csv");
		System.out.println();
		load2("PersonList.csv");
		System.out.println();
		List<Person> pList = load3("PersonList.csv");
		pList.forEach(System.out::println);
	}

}
