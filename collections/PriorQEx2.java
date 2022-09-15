package collections;

import java.util.*;

public class PriorQEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"red","blue","green","yellow"};
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.addAll(Arrays.asList(str));
		System.out.println(pq);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter new color : ");
		String s = sc.next();
		pq.offer(s);
		System.out.println(pq);

	}

}
