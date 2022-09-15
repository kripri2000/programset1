package collections;
import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ravi");
		arr.add("Rahul");
		arr.add("Geethu");
		arr.add("Anjali");
		System.out.print("Array : [ ");
		Iterator at = arr.iterator();
		while(at.hasNext())
			System.out.print(at.next()+" ");
		System.out.println("]");
	}

}
