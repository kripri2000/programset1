package collections;
import java.util.*;
public class LinkEx4 {

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
		//System.out.println("null");	
		
		Collections.reverse(lst);
		System.out.println("\nReversed Linked list : ");
		ListIterator lt1 = lst.listIterator();

		while(lt1.hasNext()) 
			System.out.print(lt1.next()+" ");
		//System.out.println("null");	
	}

}
