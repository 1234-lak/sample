package qedge.sep2;

import qedge.aug27.IfCondition;

public class Demo {
//write void type method
	public static void division(int a,int b) {
		int c=a/b;
		System.out.println(c);
		
		
}
	//verify two strings
	public static String verifyStrings  (String str1,String str2)
	{
		String res="";
		if (str1.equals(str2)){
			res="strings are equal";
			
			
		}
		else
		{
			res="strings are not equal";
			
		}
		return res;
		
		
	}
	//compare two integer values
	public static boolean comparevalues (int a,int b) 
	{
		if (a==b) {
			return true;
			
		} else {return false;

		}
		
	}


	
	
	
	public static void main(String[] args) {
		Demo.division(4560, 60);
		String ver=Demo.verifyStrings("seety", "lakshmi");
		System.out.println(ver);
		boolean w=Demo.comparevalues(3000, 200);
		System.out.println(w);
		
		
	}

}
