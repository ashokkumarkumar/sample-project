package qedge.Nov9;

public class Demo12 {

	public static void main(String[] args) {

//split method
		
		String str="31/12/2022";
		String x[]=str.split("/");
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	
//split alternate method
	 
		String str1="31/12/2022";
		String y[]=str.split("/");
		for (String each:y) {
			System.out.println(each);
		}
	}
}