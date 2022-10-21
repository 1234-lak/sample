package qedge.sep1;

public class Demo {
	//global variables
	int a,b,c;
	double x,y,z;
	public void addition()
	{
		a=456789;
		b=789063;
		c=a+b;
		System.out.println(c);
	}
	public void divisoin()
	{ 
		x=5000;
		y=50;
		z=x/y;
		System.out.println(z);

	}
	public void subtraction()
	{
		a=500;
		b=400;
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		//create reference object to  call non static method
		Demo w=new Demo();
		w.addition();
		w.subtraction();
		w.divisoin();



	}

}
