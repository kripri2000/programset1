package exceptions;

class myCustomException extends Exception{    //custom exception
}
public class CustomException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int age = 23;
		try {
			if(age<18)
				throw new myCustomException();
			else
				System.out.println("Eligible to vote");
		}
		catch(myCustomException me) {
			System.out.println("Custom Exception caught:Not Eligible for vote");
		}

	}

}
