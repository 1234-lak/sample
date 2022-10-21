package qedge.sep2;

public class Demo2 {

	public static void main(String[] args) {
		// equals and equals ignore case
		String str1="hai";
		String str2="hai";
		String str3="Hai";
		String str4="HAI";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3)); 
		System.out.println(str1.equalsIgnoreCase(str4));

	
//contains
	String str="my name is lakshmi";
	System.out.println(str.contains("my"));
	
	}
}
