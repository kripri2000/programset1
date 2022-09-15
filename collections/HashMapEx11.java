package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3,"Black");
		System.out.println(hm);
		Set keys = hm.keySet();
		System.out.println("Set view of keys : "+keys );

	}

}
