
public record PersonData(
		int age,
		Gender gender,
		double weight,
		double height,
		double neck,
		double waist,
		double hip,
		Activity activity
) {

	@Override
	public String toString() {
		return "PersonData [age=" + age + ", gender=" + gender + ", weight=" + weight + ", height=" + height + ", neck="
				+ neck + ", waist=" + waist + ", hip=" + hip + ", activity=" + activity + "]";
	}
}
