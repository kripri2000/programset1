package collections;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();
		s.push(23);
		s.push(22);
		s.push(21);
		s.push(20);
		s.push(19);
		System.out.print("Stack : ");
		Iterator st = s.iterator();
		while(st.hasNext())
			System.out.print(st.next()+" ");
		s.pop();
		System.out.print("\nStack after pop : ");
		Iterator st1 = s.iterator();
		while(st1.hasNext())
			System.out.print(st1.next()+" ");

	}

}
