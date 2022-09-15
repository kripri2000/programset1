package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("Red");
		tr.add("Blue");
		tr.add("Yellow");
		tr.add("Green");
		Iterator i = tr.descendingIterator();
		while(i.hasNext())
			System.out.print(i.next()+" ");
		

	}

}
