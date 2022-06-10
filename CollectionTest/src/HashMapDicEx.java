import java.util.*;

public class HashMapDicEx {
	
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("pineapple", "파인애플");
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println(key + value);
		}
	}
}
