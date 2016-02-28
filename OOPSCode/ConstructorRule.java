class A11
{
	A11(){
		System.out.println("I am Constructor ");
	}
	void A11(){
		System.out.println("I am Method");
	}
/*	A11(){
		System.out.println("A Class Cons");
	}
	A11(int x){
		System.out.println("A Class Param Cons Call");
	}*/
}
public class ConstructorRule {

	public static void main(String[] args) {
		A11 obj = new A11();
		obj.A11();

	}

}
