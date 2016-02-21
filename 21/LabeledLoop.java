
public class LabeledLoop {

	public static void main(String[] args) {
		myloop:
		for(int i = 1; i<=3 ; i++){
			for(int j = 1; j<=3; j++){
				if(i==j){
					break myloop;
					//continue myloop;
					//break;
				}
				else{
					System.out.println("I is "+i+
							"And J is "+j);
				}
			}
		}
	}

}
