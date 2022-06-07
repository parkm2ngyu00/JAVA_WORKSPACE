
public class Words {
	
	private String[] words;
	
	public Words(String[] words) {
		this.words = words;
	}
	
	public int getNumberOfWords() {
		return words.length;
	}
	
	// 각 단어의 길이를 반환한다
	public int getWordLength(int index) {
		if (index >= 0 && index <= words.length)
			return words[index].length();
		return -1;
	}
}
