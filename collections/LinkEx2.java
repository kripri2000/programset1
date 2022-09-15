package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkEx2 {
	public static void main(String[] args) {
		
		int data;
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		ListIterator lt = lst.listIterator();
		System.out.println("Linked list : ");
		while(lt.hasNext()) 
			System.out.print(lt.next()+" ");
}

}
