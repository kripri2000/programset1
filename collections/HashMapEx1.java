package collections;
import java.util.*;
public class HashMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key;
		String value;
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Red");
		hm.put(2,"Blue");
		//System.out.println(hm);
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter the key : ");
		key = sc.nextInt();
		System.out.print("Enter the value : ");
		value = sc.next();
		hm.put(key,value);
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}