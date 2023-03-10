package qedge.Nov8;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		for (int i=1;i<=5;i++)
		{
		System.out.println("Ente Your Course");
		String course=s.next();

		switch (course) {
		case "MANUAL TESTING":
			System.out.println("Course is Available");
			break;

		case "SELENIUM":
			System.out.println("Course is Available::"+course);
			break;

		default:
			System.out.println("Course is not Available::"+course);
		}
	}
}
}
