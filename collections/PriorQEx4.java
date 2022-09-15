//Compare two priority queues

package collections;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorQEx4 {

	public static void main(String[] args) {
		int flag=0;
		// TODO Auto-generated method stub
		String[] str1 = {"red","blue","green","yellow"};
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.addAll(Arrays.asList(str1));
		//System.out.println(pq1);
		String[] str2 = {"red","blue","green","yellow"};
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq2.addAll(Arrays.asList(str2));
		
		if(pq1.size() != pq2.size())
			System.out.println("Both queues are different");
		/*else
		{
			PriorityQueue<String> newpq = new PriorityQueue<String>(pq1);
			newpq.retainAll(pq2);
			//System.out.println(newpq);
			
			if(newpq.size() == pq1.size())
				System.out.println("Both queues are equal");
			else
				System.out.println("Both queues are different");

		}*/
		else {
			for(String val1:pq1) {
				for(String val2:pq2) {
					if(val1 == val2)
						flag++;	
				}
			}
			if(flag==pq1.size())
				System.out.println("Both queues are equal");
			else
				System.out.println("Both queues are different");
				
		}	
		//System.out.println(pq);*/

	}

}
