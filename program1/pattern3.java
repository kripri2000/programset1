package program1;

public class pattern3 {

	public static void main(String[] args) {
		int i,j,cntr=1;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<3;j++) {
				System.out.print(cntr++);
				//cntr--;
			}
			
			cntr--;
			if(cntr == 4) {
				System.out.println();
				for(int k=1;k<3;k++) 
					System.out.print(cntr);
				cntr++;
			}
			System.out.println();
		}

	}

}
