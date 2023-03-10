package qedge.Nov14;
public class Demo {

	//non static global variable 

 int a,b,c;
double x,y,z;
public void addition()
{
	a=2987;
	b=987;
	c=a+b;
	System.out.println(c);
}
public void division()
{
	x=98755;
	y=98;
	z=x/y;
	System.out.println(z);
}
	public static void main(String[] args) {

	//creating reference object to call non static methods

		Demo n = new Demo();
		n.division();
		n.addition();
	}
}