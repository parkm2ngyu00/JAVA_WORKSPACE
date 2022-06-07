
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
			lengthCounts[length]++; // length ���� index�� �ΰ� lengthCounts ++
			groupCounts[LengthGroup.indexOf(length)]++; // length ���� ���� LengthGroup class���� indexOf method �����Ų ����� index�� �ΰ� groupCounts �� ++
		}
	}
	
	public void diagram() {
		for (int i = 0; i < lengthCounts.length; i++) {
			System.out.printf("%d : (%d)\n", i, lengthCounts[i]); // �ܾ� ���� ���� ���
		}
		for (int i = 0; i < groupCounts.length; i++) {
			System.out.printf("%s : (%d)", LengthGroup.names()[i], groupCounts[i]); // ���� ������ ���� ���
			for (int j = 0; j < groupCounts[i]; j++) {
				System.out.print("+"); // ������ŭ '+' �ݺ����
			}
			System.out.println();
		}
	}
}
