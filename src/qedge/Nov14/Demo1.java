package qedge.Nov14;
public class Demo1 {
	//non static global variable
	int a,b,c;
	double x,y,z;
	public void addition()
	{
		a=10;
		b=25;
		c=a/b;
		System.out.println(c);
	}
	public void division()
	{
		x=45;
		y=64;
		z=x/y;
		System.out.println(z);
	}	
	public static void main(String[] args) {
	
		//creating reference object to call non static methods
		Demo1 n=new Demo1();
		n.addition();
		n.division();
	}
}
