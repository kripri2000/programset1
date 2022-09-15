package program1;

public class pattern9 {

	public static void main(String[] args) {
		int i,j;
		
		//String str;
		for(i=1;i<10;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2 != 0) { //if odd position
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}					
			}
			System.out.println();
		}


	}

}
