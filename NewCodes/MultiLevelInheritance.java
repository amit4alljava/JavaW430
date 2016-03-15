class WW
{
	int x;
	WW(){
		x = 100;
	}
}
class WW2 extends WW
{
	int x ;
	WW2(){
		x=200; 
	}
}
class W3 extends WW2
{
	int x = 300;
	W3(int x){
		int z = ((WW)this).x + super.x + this.x + x;
		System.out.println(z);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		W3 obj =new W3(900);

	}

}
