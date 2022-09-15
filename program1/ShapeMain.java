package program1;
class Shape{
	public void showshape() {
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape{
	public void showshape() {
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shape{
	public void showshape() {
		System.out.println("This is Circle");
	}
}
class Square extends Rectangle{
	public void showshape() {
		System.out.println("Square is a Rectangle");
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		Shape sh = new Square();
		Rectangle r = new Square();
		sh.showshape();
		r.showshape();

	}

}
