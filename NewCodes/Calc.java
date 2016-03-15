// this is my functionality
public class Calc {
	public int add(int x, int y){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(x<0 && y<0){
			return 0;
		}
		return x + y;
	}
	public int add(String x, String y){
		return Integer.parseInt(x) + Integer.parseInt(y);
	}

}
