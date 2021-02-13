
import java.util.*;
import java.util.Map.Entry;

public class Assignment3Q8a {
	public static void failFast(Map<String, String> cityCode) {
		Iterator<Entry<String, String>> itr = cityCode.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// it will through Exception,HashMap has fail-fast iterator
			//We can not do concurrent modification.
			cityCode.put("Chennai", "5"); 
		}
	}

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Delhi", "1");
		map.put("Mumbai", "2");
		map.put("Kanpur", "3");
		map.put("Gorakhpur", "4");

		failFast(map);

	}
}