package collections;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		System.out.println(hs);
		HashSet<String> copyhs = new HashSet<String>();
		copyhs = (HashSet)hs.clone();
		System.out.println(copyhs);
		

	}

}
