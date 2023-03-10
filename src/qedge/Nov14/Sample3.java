package qedge.Nov14;

public class Sample3 {
	
//non static global variable
	 int a,b,c;
	 double x,y,z;
	
//static method
	public static void multiplication()
	{
		a=10;
		b=35;
		c=a*b;
		System.out.println(c);
	}
		//12,13,14,15 lines error bcoz non static varibles declaring in static method
//non static method 10th line
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