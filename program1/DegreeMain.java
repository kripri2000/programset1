package program1;
class Degree{
	void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree{
	void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree{
	void getDegree() {
		System.out.println("I am a Postgraduate");
	}
}


public class DegreeMain {

	public static void main(String[] args) {
		Degree dobj = new Degree();
		dobj.getDegree();
		Undergraduate uobj = new Undergraduate();
		uobj.getDegree();
		Postgraduate pobj =  new Postgraduate();
		pobj.getDegree();
		

	}

}
