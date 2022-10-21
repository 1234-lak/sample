package qedge.aug29;

public class SingleDimension {

	public static void main(String[] args) {
		// print ten integers into array collection
		int x[]=new int[10];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		x[5]=600;
		x[6]=700;
		x[7]=800;
		x[8]=900;
		x[9]=1000;  
		
		System.out.println(x[6]);
		System.out.println(x[3]);
		//print length of array
		System.out.println(x.length);
		//print all positions in array one by one
		for (int each : x) {
			System.out.println(each);
		}
		
				

	}

}
