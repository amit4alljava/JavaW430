class Dept{
	int deptId;
	String deptName;
	Dept(int deptId , String deptName){
		this.deptId =deptId;
		this.deptName = deptName;
	}
}
class Print{
	// Pass by Value 
	double print(int empId , String name, double salary){
		System.out.println("Id "+empId);
		System.out.println("Name "+name);
		salary = salary + 1000;
		System.out.println("Salary "+salary);
		return salary;
	}
	// Pass By Ref
	Dept print(Employee obj){
		System.out.println("Id "+obj.id);
		System.out.println("Name "+obj.name);
		obj.salary = obj.salary + 1000;
		System.out.println("Salary "+obj.salary);
		Dept d = new Dept(1001,"IT");
		return d; 
	}
	
}
class Employee{
	int id;
	String name;
	double salary;
	Employee(int id , String name , double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class PassingObject {

	public static void main(String[] args) {
		Employee ram = new Employee(1001,"Ram",9999);
		Print print = new Print();
		//print.print(ram.id, ram.name, ram.salary);
		Dept d1= print.print(ram);
		System.out.println("Now Salary is "+ram.salary);
		System.out.println(d1.deptId+" "+d1.deptName);
	}

}
