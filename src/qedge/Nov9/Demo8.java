package qedge.Nov9;

public class Demo8 {

	public static void main(String[] args) {
		String str1="i am learning java";
		String str2="learn";
		String str3="Learn";
		String str4="i am";
		
		System.out.println(str1.contains(str2));		//true
		System.out.println(str1.contains(str3));		//false
		System.out.println(str1.contains(str4));		//true
	}

}
