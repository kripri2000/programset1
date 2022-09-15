package collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3,"Black");
		System.out.println(hm);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be searched : ");
		String value = sc.next();
		if(hm.containsValue(value))
			System.out.println("HashMap contains value "+value);
		else
			System.out.println("HashMap has no value "+value);

	}

}
