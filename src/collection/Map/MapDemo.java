package collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<>();
		
		map1.put("ocean", "Fishes");
		map1.put("Land", "Humans and Animals");
		map1.put("Sky","Birds");
		System.out.println(map1);

	}

}
