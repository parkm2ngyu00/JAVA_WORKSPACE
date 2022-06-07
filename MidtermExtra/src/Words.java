
public class Words {
	
	private String[] words;
	
	public Words(String[] words) {
		this.words = words;
	}
	
	public int getNumberOfWords() {
		return words.length;
	}
	
	// �� �ܾ��� ���̸� ��ȯ�Ѵ�
	public int getWordLength(int index) {
		if (index >= 0 && index <= words.length)
			return words[index].length();
		return -1;
	}
}
