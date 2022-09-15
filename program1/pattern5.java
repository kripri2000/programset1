package program1;

public class pattern5 {

	public static void main(String[] args) {
		int i,j;
		//String str;
		for(i=4;i>0;i--)
		{
			for(j=1;j<=(2*i-1);j++)
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
