package collections;
import java.util.*;

public class LinkEx3 {

	public static void main(String[] args) {
		int data,pos;
		// TODO Auto-generated method stub
		LinkedList<Integer> lst = new LinkedList<Integer>();
		System.out.println("Enter the elements : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			data = sc.nextInt();
			lst.add(data);
		}
		System.out.println("Enter the position : ");
		pos = sc.nextInt();
		ListIterator lt = lst.listIterator();
		System.out.println("Elements from position "+pos+" : ");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
	}

}
