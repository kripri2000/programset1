package collections;

import java.util.*;

public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3, "Black");
		HashMap<Integer,String> new_hm = new HashMap<Integer,String>();
		new_hm.putAll(hm);
		for(Map.Entry m:new_hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}


	}

}
