// Rule -1 Access Specifier can be change and it must
// be same or greater
// private , default , protected , public
// Final use

//final class P1
class P1 
{
	final int MIN_AGE ;
	P1(){
		MIN_AGE=18;
	}
	P1(int x){
	this();
		//MIN_AGE=18;
	}
	//final void print(){
	void print(){	
	int age = 21;
		if(age>MIN_AGE){
			
		}
		System.out.println("P1 Print call");
	}
}
class P2 extends P1
{
	@Override
	protected void print(){
		System.out.println("P2 Print Call");
	}
	
}
public class OverrideDemo {

	public static void main(String[] args) {
		

	}

}
