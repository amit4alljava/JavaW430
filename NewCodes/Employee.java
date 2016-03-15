
public class Employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee ram = new Employee();
		ram.setId(1001);
		ram.setName("Ram");
		ram.setSalary(9090);
		System.out.println(ram.getId());
		System.out.println(ram.getName());
		System.out.println(ram.getSalary());
		
	}

}
