import java.util.ArrayList;
import java.util.List;

//Lab4 (interface, collection)
//Kyoung Shin Park (Dankook University, Computer Engineering) 2022/03/15

public class Lab4 {
 	 	
	public static void main(String[] args) {

	 	List<PersonData> data = new ArrayList<>();
	 	data.add(new PersonData(23, Gender.FEMALE, 54.25, 167.75, 36.2, 85.2, 94.5, Activity.EXTRA_ACTIVE));
	 	data.add(new PersonData(74, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.LIGHTLY_ACTIVE));
	 	data.add(new PersonData(34, Gender.FEMALE, 63.49, 169.07, 36.0, 83.4, 89.6, Activity.VERY_ACTIVE));
	 	data.add(new PersonData(54, Gender.MALE, 94.1, 177.8, 40.8, 108.5, 107.1, Activity.MODERATELY_ACTIVE));
	 	data.add(new PersonData(35, Gender.MALE, 57.03, 166.37, 34.0, 75.0, 89.2, Activity.EXTRA_ACTIVE));
	 	data.add(new PersonData(35, Gender.MALE, 80.38, 180.34, 38.4, 90.3, 98.7, Activity.MODERATELY_ACTIVE));
	 	data.add(new PersonData(56, Gender.FEMALE, 59.93, 161.61, 38.7, 90.3, 99.9, Activity.MODERATELY_ACTIVE));
	 	data.add(new PersonData(47, Gender.MALE, 102.83, 182.25, 41.5, 108.8, 114.4, Activity.SEDENTARY));
	 	data.add(new PersonData(69, Gender.FEMALE, 63.72, 165.72, 35.8, 79.4, 89.0, Activity.LIGHTLY_ACTIVE));
	 	data.add(new PersonData(55, Gender.MALE, 90.03, 188.59, 38.3, 96.7, 106.6, Activity.LIGHTLY_ACTIVE));
		
		// foreach
		System.out.println("\nforeach list calculator");
		HealthCalculatorListManager listManager = new HealthCalculatorListManager();
		for (PersonData person : data) {
			System.out.println(person);
			for (Mode mode : Mode.values()) {
				IHealthCalculator calculator = HealthCalculatorFactory.getInstance(mode);
				calculator.setDataInput(person);
				listManager.add(calculator);
			}	
		}		
		listManager.print();
		System.out.println("\nsort list calculator");
		listManager.sort();
		listManager.print();
		
		System.out.println("\nBMI Normal list calculator");
		List<IHealthCalculator> bmiNormal = listManager.find(c -> (c instanceof BMICalculator) && (BMI.getIndex(c.calculate()) == BMI.NORMAL));
		bmiNormal.forEach(System.out::println);
		
		// for
		System.out.println("\nHealthCalculatorMapManager");
		HealthCalculatorMapManager mapManager = new HealthCalculatorMapManager();
		for (int i = 0; i < listManager.size(); i++) {
			System.out.println(listManager.get(i));
			mapManager.add(i, listManager.get(i));
		}
		
		// foreach
		for (Integer key : mapManager.getMap().keySet()) {
			System.out.println(key + " = " + mapManager.get(key));
		}
		
		// do-while
		System.out.print("do-while user input");
		IHealthCalculator calculator = null;
		do {
			System.out.print("Please enter mode [0: BMI, 1: BFP, 2: BMR, 3: CI]: ");	
			Mode mode = Mode.valueOf(UserInput.getIntegerBetween(0,3));
			calculator = HealthCalculatorFactory.getInstance(mode);
			calculator.getUserInput();
			System.out.println(calculator);
		} while(!UserInput.getExitKey());
		
		System.out.println("done..");
	}
}
