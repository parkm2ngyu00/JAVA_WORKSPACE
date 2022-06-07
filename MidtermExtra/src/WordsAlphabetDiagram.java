
public class WordsAlphabetDiagram {
	
	private final static int LCOUNT = 26; // 알파벳의 개수만큼 상수 초기화
	Words2 words;
	int[] alphabetCounts;
	int[] groupCounts;
	
	public WordsAlphabetDiagram(Words2 words) {
		this.words = words;
		alphabetCounts = new int[LCOUNT]; // 알파벳의 개수만큼 배열 크기 초기화
		groupCounts = new int[AlphabetGroup.values().length]; // AlphabetGroup 열거형 values 개수만큼 배열 크기 초기화
	}
	
	public void calculate() {
		for (int i = 0; i < words.getNumberOfWords(); i++) {
			char word = words.getLowerCaseFirstCharOfWord(i);
			alphabetCounts[(int)word - 97]++; // char type word를 integer type로 형변환 후 소문자 'a'의 아스키 코드값인 97 만큼을 뺀 index에서 ++
			groupCounts[AlphabetGroup.indexOf(word)]++; // word의 값에 따라 AlphabetGroup class 안의 indexOf method 실행시킨 결과를 index로 두고 groupCounts ++
		}
	}
	
	public void diagram() {
		for (char i = 'a'; i <= 'z'; ++i) {
			System.out.printf("%c : (%d)\n", i, alphabetCounts[(int)i - 97]); // for문이 alphabet으로 돌아가기 때문에 역시 int type 형변환 후 97 마이너스
		}
		for (int i = 0; i < groupCounts.length; i++) {
			System.out.printf("%s : (%d)", AlphabetGroup.names()[i], groupCounts[i]); // 알파벳 범위와 개수 출력
			for (int j = 0; j < groupCounts[i]; j++) {
				System.out.print("+"); // 개수만큼 '+'반복출력
			}
			System.out.println();
		}
	}
}
