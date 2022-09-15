package program1;

public class pattern4 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			
			for(j=1;j<=3;j++) {
				if(i==2) {
					System.out.println(i+" "+j);
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
