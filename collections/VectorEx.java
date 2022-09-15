package collections;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Hello");
		v.add("Hi");
		v.add("Bye");
		Iterator vt = v.iterator();
		while(vt.hasNext())
			System.out.print(vt.next()+" ");
		

	}

}
