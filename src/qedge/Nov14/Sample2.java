package qedge.Nov14;

public class Sample2 {
	
//static global variable
	static int a,b,c;
	static double x,y,z;
	
//static method
	public static void multiplication()
	{
		a=10;
		b=35;
		c=a*b;
		System.out.println(c);
	}
	
//non static method
	public void division()
	{
		x=45;
		y=48;
		z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		
//call static method
		Sample1.multiplication();
		
//creating reference object to call non static method
		Sample2 n= new Sample2();
		
//call non static method
		n.division();
	}
}