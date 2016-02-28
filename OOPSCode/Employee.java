// SRP
// Encapsulation = Data + Methods in a Single Unit
// and this is called Class
// Data Hiding = Making your Data as Private
// Good Encapsulation = Data Hiding + public methods
public class Employee {
	private int id; // Member Variable or Instance Variables
	private String name;
	private String address;
	private double salary;
	private String phone;
	private String companyName;
	private String gender;
	private String email;
	private String dept;
	private String manager;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getGender() {
		return gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	/*
	 * Constructor -> Constructor is same like a method
	 * Class Name and Constructor Name is Same
	 * It is Called when you create a New Object
	 * And It is used to Initalize the Instance Variables
	 * It does not return any Value
	 * Every Class By Default has Default Constructor
	 * And If you create Any Other Constructor then Default 
	 * Constructor is Gone (If you not created the Default)
	 */
	Employee(){
		//this(102,"Ram", "Mumbai", 9090, "3422");
		
		companyName="TCS";
	}
	
	 Employee(int i , String name , double salary ){
		// Assign Local Variable into Instance Variable
		//Employee();
		 this(); // Now it is calling Default Constructor of the Same Class
		 if(i>0 && salary>0){
		//id = i*companyName.length();
		id = i;
		this.name = name;
		//this.address = address;
		this.salary = salary;
		//this.phone = phone;
		}
		else
		{
			System.out.println("Invalid Data");
		}
		 
	}
		private double calculateDA(){ 
			return salary * 0.10;
		}
		private  double calculateTA(){ 
			return salary * 0.20;
		}
		private double calculatePF(){ 
			return salary * 0.20;
		}
	private double calculateHRA(){ 
		return salary * 0.50;
	}
	public double calculateSalary(){
		return salary + calculateHRA() + calculateDA() +calculateTA()+ calculatePF();
	}
	 
	 
	/*public void takeInput(int i , String name , String address , double salary , String phone){
		// Assign Local Variable into Instance Variable
		if(i>0 && salary>0){
		id = i;
		
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.phone = phone;
		}
		else
		{
			System.out.println("Invalid Data");
		}
	}*/
	
	// this -> It a Predefine Keyword and it store the current
	// object reference
	/*public void print(){
		System.out.println("Id: "+id+" Name: "+name
				+" Salary: "+this.salary+" Phone: "+this.phone
				+" Address: "+this.address+" Company Name "+this.companyName);
	}*/
	

}
