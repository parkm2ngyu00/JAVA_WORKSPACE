import java.util.*;

public class HashMapDicEx {
	
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("apple", "���");
		dic.put("banana", "�ٳ���");
		dic.put("pineapple", "���ξ���");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println(key + value);
		}
	}
}
