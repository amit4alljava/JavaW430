interface G
{
	void print();
}
// 1st Way of Using Interface
class G1 implements G
{
	@Override
	public void print(){
		System.out.println("G1 Print Call");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		int x =10;
		/*G1 obj = new G1();
		obj.print();*/
		// We Can't Create Interface Object
		if(100>20){	
			// 2nd Way
		G obj = new G(){
				@Override
				public void print(){
					System.out.println("Anonymous Print Call");
				}
			};
			obj.print();
		}
		}

}
