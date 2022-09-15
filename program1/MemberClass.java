package program1;
class Member{
		String name,address,phno;
		int age,salary;
		
		public void printSalary() {
			System.out.println(salary);
		}
}
class Employee extends Member{
		String special;
		
	}
class Manager extends Member{
		String dept;
}

public class MemberClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "Rahul";
		emp.phno = "1233123456";
		emp.address = "East Lane,Trivandrum";
		emp.salary = 20000;
		
		System.out.println("Employee details :");
		System.out.println(emp.name);
		System.out.println(emp.phno);
		System.out.println(emp.address);
		System.out.println(emp.salary);
		//System.out.println();
		
		Manager man = new Manager();
		man.name = "Anitha";
		man.phno = "3456123456";
		man.address = "Indira Nagar";
		man.salary = 70000;
		//System.out.println();
		System.out.println("\nManager details :");
		System.out.println(man.name);
		System.out.println(man.phno);
		System.out.println(man.address);
		System.out.println(man.salary);
		
	}

}
