
public class WordsAlphabetDiagram {
	
	private final static int LCOUNT = 26; // ���ĺ��� ������ŭ ��� �ʱ�ȭ
	Words2 words;
	int[] alphabetCounts;
	int[] groupCounts;
	
	public WordsAlphabetDiagram(Words2 words) {
		this.words = words;
		alphabetCounts = new int[LCOUNT]; // ���ĺ��� ������ŭ �迭 ũ�� �ʱ�ȭ
		groupCounts = new int[AlphabetGroup.values().length]; // AlphabetGroup ������ values ������ŭ �迭 ũ�� �ʱ�ȭ
	}
	
	public void calculate() {
		for (int i = 0; i < words.getNumberOfWords(); i++) {
			char word = words.getLowerCaseFirstCharOfWord(i);
			alphabetCounts[(int)word - 97]++; // char type word�� integer type�� ����ȯ �� �ҹ��� 'a'�� �ƽ�Ű �ڵ尪�� 97 ��ŭ�� �� index���� ++
			groupCounts[AlphabetGroup.indexOf(word)]++; // word�� ���� ���� AlphabetGroup class ���� indexOf method �����Ų ����� index�� �ΰ� groupCounts ++
		}
	}
	
	public void diagram() {
		for (char i = 'a'; i <= 'z'; ++i) {
			System.out.printf("%c : (%d)\n", i, alphabetCounts[(int)i - 97]); // for���� alphabet���� ���ư��� ������ ���� int type ����ȯ �� 97 ���̳ʽ�
		}
		for (int i = 0; i < groupCounts.length; i++) {
			System.out.printf("%s : (%d)", AlphabetGroup.names()[i], groupCounts[i]); // ���ĺ� ������ ���� ���
			for (int j = 0; j < groupCounts[i]; j++) {
				System.out.print("+"); // ������ŭ '+'�ݺ����
			}
			System.out.println();
		}
	}
}
