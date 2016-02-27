// SRP
public class Employee {
	int id; // Member Variable or Instance Variables
	String name;
	String address;
	double salary;
	String phone;
	
	void takeInput(int i , String name , String address , double salary , String phone){
		// Assign Local Variable into Instance Variable
		id = i;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.phone = phone;
	}
	
	// this -> It a Predefine Keyword and it store the current
	// object reference
	void print(){
		System.out.println("Id: "+id+" Name: "+name
				+" Salary: "+this.salary+" Phone: "+this.phone
				+" Address: "+this.address);
	}
	

}
