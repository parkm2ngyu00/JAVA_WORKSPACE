
public class WordsLengthDiagram {
	
	private final static int LCOUNT = 16;
	private Words words;
	private int[] lengthCounts;
	private int[] groupCounts;
	
	public WordsLengthDiagram(Words words) {
		this.words = words;
		lengthCounts = new int[LCOUNT];
		groupCounts = new int[LengthGroup.values().length];
	}
	
	public void calculate() {
		for (int i = 0; i < words.getNumberOfWords(); i++) {
			int length = words.getWordLength(i);
			lengthCounts[length]++; // length 값을 index로 두고 lengthCounts ++
			groupCounts[LengthGroup.indexOf(length)]++; // length 값에 따라 LengthGroup class에서 indexOf method 실행시킨 결과를 index로 두고 groupCounts 값 ++
		}
	}
	
	public void diagram() {
		for (int i = 0; i < lengthCounts.length; i++) {
			System.out.printf("%d : (%d)\n", i, lengthCounts[i]); // 단어 길이 개수 출력
		}
		for (int i = 0; i < groupCounts.length; i++) {
			System.out.printf("%s : (%d)", LengthGroup.names()[i], groupCounts[i]); // 길이 범위와 개수 출력
			for (int j = 0; j < groupCounts[i]; j++) {
				System.out.print("+"); // 개수만큼 '+' 반복출력
			}
			System.out.println();
		}
	}
}
