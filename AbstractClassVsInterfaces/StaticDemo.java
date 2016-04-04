class Employee{
	static int counter;  // Class Variable
	int empno;  // Instance Variable
	String name;
	double salary;
	int counter2 ;
	Employee(int empno,String name, double salary){
		this.empno = empno;
		this.name = name;
		this.salary =salary;
		counter++;
		counter2++;
		System.out.println("Name "+name+" Counter "+counter +" Counter2 "+counter2);
		/*System.out.println("Counter is "+counter);
		System.out.println("Counter2 is "+counter2);*/
	}
	void print(){
		System.out.println("Empno "+empno+" Name "+name+" Salary "+salary);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		//System.out.println(Employee.counter);
		Employee ram1 = new Employee(101, "Ram", 5454);
		//System.out.println(ram1.name);
		Employee ram2 = new Employee(101, "Ram2", 5454);
		Employee ram3 = new Employee(101, "Ram3", 5454);

	}

}
