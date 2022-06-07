
public class Words2 {

	private String[] words;
	
	// constructor
	public Words2(String[] words) {
		this.words = words;
	}
	
	public int getNumberOfWords() {
		return words.length;
	}
	
	// words 배열의 index값으로 들어온 data를 소문자로 바꾼 후 첫 알파벳을 반환한다.
	public char getLowerCaseFirstCharOfWord(int index) {
		if (index >= 0 && index <= words.length) {
			return words[index].toLowerCase().charAt(0);
		}
		return '\u0000';
	}
}
