/*
과제 : Lab3
분반 : 3분반
학번 : 32191597
이름 : 박민규
날짜 : 2022-04-14
*/

public class Lab3 {
	// PersonData record array
	static PersonData[] Data = {
			new PersonData(23, Gender.FEMALE, 54.25, 167.75, 
					36.2, 85.2, 94.5, Activity.EXTRA_ACTIVE),
			new PersonData(74, Gender.MALE, 94.1, 177.8, 
					40.8, 108.5, 107.1, Activity.LIGHTLY_ACTIVE),
			new PersonData(34, Gender.FEMALE, 63.49, 169.07, 
					36.0, 83.4, 89.6, Activity.VERY_ACTIVE),
			new PersonData(54, Gender.MALE, 94.1, 177.8, 
					40.8, 108.5, 107.1, Activity.MODERATELY_ACTIVE),
			new PersonData(35, Gender.MALE, 57.03, 166.37, 
					34.0, 75.0, 89.2, Activity.EXTRA_ACTIVE),
			new PersonData(35, Gender.MALE, 80.38, 180.34, 
					38.4, 90.3, 98.7, Activity.MODERATELY_ACTIVE),
			new PersonData(56, Gender.FEMALE, 59.93, 161.61, 
					38.7, 90.3, 99.9, Activity.MODERATELY_ACTIVE),
			new PersonData(47, Gender.MALE, 102.83, 182.25, 
					41.5, 108.8, 114.4, Activity.SEDENTARY),
			new PersonData(69, Gender.FEMALE, 63.72, 165.72, 
					35.8, 79.4, 89.0, Activity.LIGHTLY_ACTIVE),
			new PersonData(55, Gender.MALE, 90.03, 188.59, 
					38.3, 96.7, 106.6, Activity.LIGHTLY_ACTIVE)
	};
	// mode 에 따른 calculate
	static void calculate(Mode mode, PersonData person) {
		if (mode == Mode.BMI) {
			HealthCalculator BMI = new BMICalculator(person.weight(), person.height());
			BMI.calculate();
			System.out.println(BMI);
		} else if (mode == Mode.BFP) {
			HealthCalculator BFP = new BFPCalculator(person.gender(), person.height(), 
					person.weight(), person.neck(), person.waist(), person.hip());
			BFP.calculate();
			System.out.println(BFP);
		} else if (mode == Mode.BMR) {
			HealthCalculator BMR = new BMRCalculator(person.age(), person.gender(), 
					person.weight(), person.height());
			BMR.calculate();
			System.out.println(BMR);
		} else if (mode == Mode.CI) {
			HealthCalculator CI = new CalorieIntakeCalculator(person.activity(), person.age(), 
					person.gender(), person.weight(), person.height());
			CI.calculate();
			System.out.println(CI);
		}
	}
	
	public static void main(String[] args) {
		// member field 에 저장되어 있는 PersonData(총 40개) 출력
		for(var data : Data) {
			calculate(Mode.BMI, data);
			calculate(Mode.BFP, data);
			calculate(Mode.BMR, data);
			calculate(Mode.CI, data);
		}
		
		// UserInput class를 활용하여 모드에 따른 계산 결과 출력
		do {
			System.out.print("계산하고 싶은 모드의 숫자를 입력해 주세요(1.BMI, 2.BFP, 3.BMR, 4.CI) : ");
			int value = UserInput.getIntegerBetween(1, 4);
			switch (value) {
			case 1:
				HealthCalculator BMI = new BMICalculator();
				BMI.getUserInput();
				BMI.calculate();
				System.out.println(BMI);
				break;
			case 2:
				HealthCalculator BFP = new BFPCalculator();
				BFP.getUserInput();
				BFP.calculate();
				System.out.println(BFP);
				break;
			case 3:
				HealthCalculator BMR = new BMRCalculator();
				BMR.getUserInput();
				BMR.calculate();
				System.out.println(BMR);
				break;
			case 4:
				HealthCalculator CI = new CalorieIntakeCalculator();
				CI.getUserInput();
				CI.calculate();
				System.out.println(CI);
				break;
			}
		} while (UserInput.getExitKey() == false); // enter를 누르는 동안 반복, q를 누르면 탈출
		
		// My class calculator
		do {			
			MyInheritanceClass cal = new MyInheritanceClass();
			cal.getUserInput();
			cal.calculte();
			System.out.println(cal);
		} while(UserInput.getExitKey() == false);
	}
}
