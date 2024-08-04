package Lec37;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// Add
		map.put("Raj", 79);
		map.put("Ankit", 59);
		map.put("Kaju", 67);
		map.put("Ankita", 87);
		map.put("Puneet", 49);
		map.put("Amisha", 78);
		map.put("Shiva", 55);
		map.put("Kunal", 57);
		map.put("Amisha", 98);
//		map.put(null, 8);
		System.out.println(map);
//		// Get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("ankit"));
//		// ContainsKey
//		System.out.println(map.containsKey("Amisha"));
//		System.out.println(map.containsKey("Arpit"));
//		//remove
//		System.out.println(map.remove("Arpit"));
//		System.out.println(map.remove("Raj"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		map1.put("Raj", 79);
		map1.put("Ankit", 59);
		map1.put("Kaju", 67);
		map1.put("Ankita", 87);
		map1.put("Puneet", 49);
		map1.put("Amisha", 78);
		map1.put("Shiva", 55);
		map1.put("Kunal", 57);
		map1.put("Amisha", 98);
		// map1.put(null, 8);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// Add
		map2.put("Raj", 79);
		map2.put("Ankit", 59);
		map2.put("Kaju", 67);
		map2.put("Ankita", 87);
		map2.put("Puneet", 49);
		map2.put("Amisha", 78);
		map2.put("Shiva", 55);
		map2.put("Kunal", 57);
		map2.put("Amisha", 98);
	//	map2.put(null, 8);
		System.out.println(map2);
		
//		System.out.println(map.keySet());
//		Set<String> s =map.keySet();
//		for(String key:s) {
//			System.out.println(key+" "+map.get(key));
//		}
		
		for(String key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}

	}

}














