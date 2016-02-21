
public class Demo2 {

	public static void main(String[] args) {
		//int array[] = {10,20,30,40,50,60,70};
		//int []array = {10,20,30,40,50,60,70};
		//int []array= new int[]{10,20,30,40};
		int []array = new int[5];
		array[0]=100;
		array[1]=200;
		//int [][]arr = new int[3][4];
		//int [][]arr = {{10,20},{30,40},{50,60}};
		//int [][] arr = new int[3][4];
		//int  arr[][] = new int[3][4];
		int [] arr[] = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[10];
		arr[2] = new int[20];
		//System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++){
			for(int j = 0 ; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
		for(int d[]:arr){
			for(int e : d){
				System.out.print("Inner Loop "+e);
			}
			System.out.println();
		}
		/*for(int i = 0; i<array.length ; i++){
			System.out.println(array[i]);
		}*/
		// Enhance for Loop
		// 1.5
		for(int x : array){
			System.out.println(x);
		}

	}

}
