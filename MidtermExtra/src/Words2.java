
public class Words2 {

	private String[] words;
	
	// constructor
	public Words2(String[] words) {
		this.words = words;
	}
	
	public int getNumberOfWords() {
		return words.length;
	}
	
	// words �迭�� index������ ���� data�� �ҹ��ڷ� �ٲ� �� ù ���ĺ��� ��ȯ�Ѵ�.
	public char getLowerCaseFirstCharOfWord(int index) {
		if (index >= 0 && index <= words.length) {
			return words[index].toLowerCase().charAt(0);
		}
		return '\u0000';
	}
}
