package qedge.Nov9;

public class Demo13 {

	public static void main(String[] args) {

//split method
		
		String company="GOOGLE@TCS@DELOITTE@IBM@HCL@MAHINDRA@CTS";
		String x[]=company.split("@");
		System.out.println(x[2]);

//split alternate method
		String y="GOOGLE@TCS@DELOITTE@IBM@HCL@MAHINDRA@CTS";
		String k[]=y.split("@");
		System.out.println(k[6]);
		for (String each:k) {
			System.out.println(each);
		}
	}

}
