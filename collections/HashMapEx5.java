package collections;

import java.util.HashMap;

public class HashMapEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3, "Black");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());

	}

}
