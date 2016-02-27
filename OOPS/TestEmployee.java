
public class TestEmployee {

	public static void main(String[] args) {
		//int x = 100;
		Employee shyam = new Employee();
		shyam.id=-101;
		shyam.name="Shyam";
		shyam.salary=-9999;
		//shyam.takeInput(101,"Shyam", "Delhi", 9090, "2222");
		shyam.print();
		Employee ram = new Employee();
		ram.takeInput(102,"Ram", "Mumbai", 9090, "3422");
		ram.print();
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
