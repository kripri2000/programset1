package collections;
import java.util.*;
public class HashMapEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		hm.put(3,"Black");
		System.out.println(hm);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to be searched : ");
		int key = sc.nextInt();
		if(hm.containsKey(key))
			System.out.println("HashMap contains key "+key);
		else
			System.out.println("HashMap has no key "+key);
		
	}

}
