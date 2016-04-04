class L1
{
	L1(int x){
		System.out.println("L1 Param Cons");
	}
}
class L2 extends L1
{
	L2(){
		super(10);
		System.out.println("L2 Param COns");
	}
}
public class TestConsDemo {

	public static void main(String[] args) {
		L2 obj = new L2();

	}

}
