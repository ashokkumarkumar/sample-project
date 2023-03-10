package qedge.Nov14;

public class Sample1 {
	//static global variable
	static int a,b,c;
	 static double x,y,z;
	public static void multiplication()
	{
		a=10;
		b=35;
		c=a*b;
		System.out.println(c);
	}
	public static void division()
	{
		x=45;
		y=48;
		z=x/y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		Sample1.multiplication();
		Sample1.division();
	}
}
