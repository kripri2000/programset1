package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data,elt;
		// TODO Auto-generated method stub
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the element to be removed : ");
		elt = sc.nextInt();
		lst.remove(lst.indexOf(elt));
		ListIterator lt = lst.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}

	}

}
