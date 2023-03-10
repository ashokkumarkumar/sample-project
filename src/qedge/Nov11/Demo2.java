package qedge.Nov11;

public class Demo2 {

	public static void main(String[] args) {
		//divide anything with zero
		try {
			int a=456, b=0,c;
			c=a/b;
			System.out.println(c);
		}catch(Throwable t)
		{
			//System.out.println(t.getMessage());
			t.printStackTrace();
		}
		double x=87655,y=76,z;
		z=x/y;
		System.out.println(z);
	}



}


