package qedge.Nov11;

public class Demo6 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="india";
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("String are Equal::"+str1+"  "+str2);
		}
		else
		{
			try {
				throw new Error("String are Equal::"+str1+"  "+str2);
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());;
			}
			
			}
	}

}
