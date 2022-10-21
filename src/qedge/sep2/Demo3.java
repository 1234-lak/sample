package qedge.sep2;

public class Demo3 {

	public static void main(String[] args) {
		// Prefix value
		String str="iam not good";
System.out.println(str.startsWith("iam"));

//Suffix value
      String str1="my baby is nice";
      
      System.out.println(str1.endsWith("nice"));
      //Replace
      String str2="mokshi is too good girl";
      System.out.println(str2.replace("too","very"));
      
      //concat
      String str3="lovely";
      String str4="baby";
      System.out.println(str3. concat  ( str4));
      
      //split
      String str5="02/10/2020";
      String s[]=str5.split("/");
      for (String each : s) {
    	  System.out.println(each);
		
	}
      
	}
      
	}


