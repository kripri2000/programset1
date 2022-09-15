//Compare two sets

package collections;
import java.util.*;
public class SetEx1 {

	public static void main(String[] args) {
		Integer[] A = {23,2,4,5,12};
		Integer[] B = {4,28,3,2,6,1};
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		System.out.println(set1);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		System.out.println(set2);
		Set<Integer> newSet =  new HashSet<Integer>(set1);
		newSet.retainAll(set2);
		System.out.println(newSet);
		
		
	}

}
