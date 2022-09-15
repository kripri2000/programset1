package collections;

import java.util.TreeSet;

public class TreeSetEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(4);
		tr.add(8);
		tr.add(10);
		tr.add(2);
		for(int val:tr)
			if(val>7)
				System.out.println(val);

	}

}
