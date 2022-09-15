package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkEx6 {

	public static void main(String[] args) {
		int data,pos,head,tail;
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the element to insert at front : ");
		head = sc.nextInt();
		lst.offerFirst(head);
		System.out.println("Enter the element to insert at last : ");
		tail = sc.nextInt();
		lst.offerLast(tail);
		ListIterator lt = lst.listIterator();
		System.out.println("Linked list : ");
		while(lt.hasNext()) 
			System.out.print(lt.next()+" ");
		
	}

}
