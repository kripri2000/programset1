package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,pos,newdata,n;
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the position : ");
		pos = sc.nextInt();
		System.out.println("Enter the no:of elements : ");
		n = sc.nextInt();
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			newdata = sc.nextInt();
			lst.add(pos-1,newdata);
			pos++;
		}
		
		System.out.println("New Linkedlist : ");
		ListIterator lt = lst.listIterator();
		while(lt.hasNext())
			System.out.print(lt.next()+" ");
		
	}
}

