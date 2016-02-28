
public class TestEmployee {

	public static void main(String[] args) {
		//int x = 100;
		//Employee shyam = new Employee();
		/*shyam.id=-101;
		shyam.name="Shyam";
		shyam.salary=-9999;*/
		//shyam.takeInput(-101,"Shyam", "Delhi", -9090, "2222");
		//shyam.print();
		//Employee ram1 = new Employee();
		Employee ram1 = new Employee(102,"Ram",  9090);
		//ram1.print();
		ram1.setEmail("ram@tcs.com");
		System.out.println("Ram Email "+ram1.getEmail());
		System.out.println("Ram Salary "+ram1.calculateSalary());
		//ram1.print();
		System.out.println("*************************");
		//Employee shyam = new Employee();
		//Employee shyam = new Employee(101,"Shyam", "Delhi", 9090, "3422");
		//shyam.print();
		//ram.takeInput(102,"Ram", "Mumbai", 9090, "3422");
		//ram.print();
		/*ram.id = 1001;
		ram.name ="Ram";
		ram.salary=9090;
		ram.phone="2222";
		ram.address="Delhi";*/
		//ram.print();
		/*System.out.println(ram.id);
		System.out.println(ram.name);
		System.out.println(ram.salary);
		System.out.println(ram.phone);
		System.out.println(ram.address);
		*///System.out.println(ram);

	}

}
