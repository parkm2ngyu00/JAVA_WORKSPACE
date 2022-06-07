/*
과제 : Lab3
분반 : 3분반
학번 : 32191597
이름 : 박민규
날짜 : 2022-05-20
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab4 {
	
	public static void main(String[] args) {
		
		// PersonData
		List<PersonData> data = new ArrayList<>();
		data.add(new PersonData(23, Gender.FEMALE, 54.25, 167.75, 
						36.2, 85.2, 94.5, Activity.EXTRA_ACTIVE));
		data.add(new PersonData(74, Gender.MALE, 94.1, 177.8, 
					40.8, 108.5, 107.1, Activity.LIGHTLY_ACTIVE));
		data.add(new PersonData(34, Gender.FEMALE, 63.49, 169.07, 
					36.0, 83.4, 89.6, Activity.VERY_ACTIVE));
		data.add(new PersonData(54, Gender.MALE, 94.1, 177.8, 
					40.8, 108.5, 107.1, Activity.MODERATELY_ACTIVE));
		data.add(new PersonData(35, Gender.MALE, 57.03, 166.37, 
					34.0, 75.0, 89.2, Activity.EXTRA_ACTIVE));
		data.add(new PersonData(35, Gender.MALE, 80.38, 180.34, 
					38.4, 90.3, 98.7, Activity.MODERATELY_ACTIVE));
		data.add(new PersonData(56, Gender.FEMALE, 59.93, 161.61, 
					38.7, 90.3, 99.9, Activity.MODERATELY_ACTIVE));
		data.add(new PersonData(47, Gender.MALE, 102.83, 182.25, 
					41.5, 108.8, 114.4, Activity.SEDENTARY));
		data.add(new PersonData(69, Gender.FEMALE, 63.72, 165.72, 
					35.8, 79.4, 89.0, Activity.LIGHTLY_ACTIVE));
		data.add(new PersonData(55, Gender.MALE, 90.03, 188.59, 
					38.3, 96.7, 106.6, Activity.LIGHTLY_ACTIVE));
		
		// use HealthCalculatorListManager
		HealthCalculatorListManager HM = new HealthCalculatorListManager();
		for (Mode m : Mode.values()) {
			HM.add(HealthCalculatorFactory.getInstance(m));
		}
		
		// use HealthCalculatorMapManager
		HealthCalculatorMapManager HM2 = new HealthCalculatorMapManager();
		int index = 0;
		for (Mode m : Mode.values()) {
			HM2.add(index, HealthCalculatorFactory.getInstance(m));
			index++;
		}
		
		// normal calculate with HealthCalculatorListManager
		System.out.println("=======================normal calculate with HealthCalculatorListManager===========================");
		for (PersonData d : data) {
			for (int i = 0; i < 4; i++) {
				HM.get(i).setDataInput(d);
				HM.get(i).calculate();
				System.out.println(HM.get(i));
			}
			System.out.println("===================================================================================================");
		}
		
		// sort calculate with HealthCalculatorListManager
		System.out.println("\n\n\n=======================sort calculate with HealthCalculatorListManager===========================");
		for (PersonData d : data) {
			for (int i = 0; i < 4; i++) {
				HM.get(i).setDataInput(d);
				HM.get(i).calculate();
				HM.sort();
				System.out.println(HM.get(i));
			}
			System.out.println("===================================================================================================");
		}
		
		// random calculate with HealthCalculatorListManager
		System.out.println("\n\n\n=======================random calculate with HealthCalculatorListManager===========================");
		for (PersonData d : data) {
			IHealthCalculator random = HM.getRandom();
			random.setDataInput(d);
			random.calculate();
			System.out.println(random);
		}
		
		// normal calculate with HealthCalculatorMapManager
		System.out.println("\n\n\n=======================normal calculate with HealthCalculatorMapManager============================");
		for (PersonData d : data) {
			for (int j = 0; j < 4; j++) {
				HM2.get(j).setDataInput(d);
				HM2.get(j).calculate();
				System.out.println(HM2.get(j));
			}
			System.out.println("===================================================================================================");
		}
		
		// random calculate with HealthCalculatorMapManager
		System.out.println("\n\n\n=======================random calculate with HealthCalculatorMapManager============================");
		for (PersonData d : data) {
			IHealthCalculator random = HM2.getRandom();
			random.setDataInput(d);
			random.calculate();
			System.out.println(random);
		}
		
		// use predicate calculate with HealthCalculatorListManager
		System.out.println("\n\n\n================================predict calculate with list======================================");
		List<IHealthCalculator> list = new ArrayList<IHealthCalculator>();
		for (int i = 0; i < 4; i++)
			System.out.println((i+1) + ". original list hashcode : " + HM.get(i).hashCode());
		list = HM.find(null);
		System.out.println("after predict, new list size : " + list.size());
		for (PersonData d : data) {
			for (int i = 0; i < list.size(); i++) {
				list.get(i).setDataInput(d);
				list.get(i).calculate();
				System.out.println(list.get(i));
			}
			System.out.println("===================================================================================================");
		}
		
		// use predicate calculate with HealthCalculatorMapManager
		System.out.println("\n\n\n================================predict calculate with map======================================");
		for (int i = 0; i < 4; i++)
			System.out.println((i+1) + ". original map hashcode : " + HM2.get(i).hashCode());
		Map<Integer, IHealthCalculator> map = new HashMap<> ();
		map = HM2.find(null);
		System.out.println("after predict, new map size : " + map.size());
		for (PersonData d : data) {
			for (int i = 0; i < 4; i++) {
				if (map.get(i) != null) {
					map.get(i).setDataInput(d);
					map.get(i).calculate();
					System.out.println(map.get(i));	
				}
			}
			System.out.println("===================================================================================================");
		}
		
		// use user input
		System.out.println("\n\n\n==================================user input calculate=============================================");
		do {
			System.out.print("계산하고 싶은 모드의 숫자를 입력해 주세요(1.BMI, 2.BFP, 3.BMR, 4.CI) : ");
			int value = UserInput.getIntegerBetween(1, 4);
			switch (value) {
			case 1:
				HM.get(0).getUserInput();
				HM.get(0).calculate();
				System.out.println(HM.get(0));
				break;
			case 2:
				HM.get(1).getUserInput();
				HM.get(1).calculate();
				System.out.println(HM.get(1));
				break;
			case 3:
				HM.get(2).getUserInput();
				HM.get(2).calculate();
				System.out.println(HM.get(2));
				break;
			case 4:
				HM.get(3).getUserInput();
				HM.get(3).calculate();
				System.out.println(HM.get(3));
				break;
			}
		} while (UserInput.getExitKey() == false); // enter를 누르는 동안 반복, q를 누르면 탈출
		
	}
	
}
