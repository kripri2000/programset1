package collections;
import java.util.*;

public class LinkEx5 {
	public static void main(String args[]) {
		int data,pos,newdata;
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the position : ");
		pos = sc.nextInt();
		System.out.println("Enter the element : ");
		newdata = sc.nextInt();
		//System.out.println(lst.indexOf(lst.getLast()));
		if(pos == 1)
			lst.addFirst(newdata);
		else if(pos>lst.indexOf(lst.getLast()))
			lst.addLast(newdata);
		else
			lst.add(pos-1,newdata);
		
		System.out.println("New Linkedlist : ");
		ListIterator lt = lst.listIterator();
		while(lt.hasNext())
			System.out.print(lt.next()+" ");
		
	}

}
