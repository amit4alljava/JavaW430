class CallDemo
{
	/*public void show(int x){
		System.out.println("int ");
	}*/
	/*public void show(long x){
		System.out.println("long ");
	}*/
	public void show(short x){
		System.out.println("short ");
	}
	public void show(byte x){
		System.out.println("byte ");
	}
	/*public void show(Integer x){
		System.out.println("Integer ");
	}*/
	/*public void show(int ...x){
		System.out.println("int... ");
	}*/
}
public class OverloadingDemo3 {

	public static void main(String[] args) {
		CallDemo demo = new CallDemo();
		demo.show((byte)100);

	}

}
