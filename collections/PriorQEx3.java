package collections;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorQEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"red","blue","green","yellow"};
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.addAll(Arrays.asList(str));
		System.out.println(pq);
		System.out.println(pq.size());

	}

}
