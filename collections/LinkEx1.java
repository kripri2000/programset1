package collections;
import java.util.*;
public class LinkEx1 {

	public static void main(String[] args) {
		int data,newdata;
		// TODO Auto-generated method stub
		LinkedList<Integer> lst = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to the linkedlist :");
		for(int i=0;i<3;i++) {
			data = sc.nextInt();
			lst.add(data);	
		}
		System.out.print("The linked list : ");
		
		Iterator itr = lst.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+"->");
		System.out.print("null");
		System.out.print("\nEnter the new element : ");
		newdata = sc.nextInt();
		lst.addLast(newdata);
		
		System.out.print("New list : ");
		Iterator itr1 = lst.iterator();
		while(itr1.hasNext())
			System.out.print(itr1.next()+"->");
		System.out.println("null");
		

	}

}
