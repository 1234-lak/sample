package qedge.aug29;

public class SingleDimension1 {

	public static void main(String[] args) {
		//single dimension by string type data
		String str[]=new String [12];
		str[0]="jan";
		str[1]="feb";
		str[2]="mar";
		str[3]="apl";
		str[4]="may";
		str[5]="june";
		str[6]="july";
		str[7]="aug";
		str[8]="sep";
		str[9]="oct";
		str[10]="nov";
		str[11]="dec";
		System.out.println(str[7]);
		System.out.println(str[4]);
		//print array length
		System.out.println(str.length);
		//print all positions in array
		for (String each : str) {
			System.out.println(each);
			
		}
		
				 


	}

}
