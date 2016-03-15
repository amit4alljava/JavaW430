class W
{
	int x ;  // Instance Variable
	// it is used to intialize the Instance Variables
	W(){
		x = 100;
		System.out.println("W Class Default Cons");
	}
	W(int x){
		System.out.println("W Class Param Cons Call");
	}
}
class W2 extends W
{
	int y ;
	W2(){
		//super(); this will call parent class default cons
		y = ++x;
		
		System.out.println("W2 Class Default Cons "+y);
	}
	W2(int x){
		super(100);
		// super();
		System.out.println(" this is W2 Class Param Cons Call");
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		W2 obj = new W2(66);

	}

}
