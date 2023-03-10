package qedge15;
public class Demo {
public static void addition(int x, int y)
	{
		int z=x+y;
		System.out.println(z);
	}
public static String verifyString(String str1,String str2)
	{
		String res ="";
		if (str1.equalsIgnoreCase(str2))
		{
			res="Strings are Equal";
		}
		else
		{
			res="Strings are Not equal";
		}
		return res;
	}
public static boolean compareValues(int a, int b)
	{
		if (a==b)
		{
			return true;

		}
		else
		{
			return false;
		}
	}
public static void main(String[] args) {
		Demo.addition(5675675, 676786767);
		String results=Demo.verifyString("Hello", "India");
		System.out.println(results);
		boolean x=Demo.compareValues(100,200);
		System.out.println(x);
	}
}



