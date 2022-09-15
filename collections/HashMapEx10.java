package collections;

import java.util.*;

public class HashMapEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3,"Black");
		System.out.println(hm);
		System.out.println("Enter the key : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		if(hm.containsKey(key))
			System.out.print(hm.get(key));
		else
			System.out.println("Invalid key");

	}

}
