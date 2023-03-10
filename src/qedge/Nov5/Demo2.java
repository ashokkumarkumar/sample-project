package qedge.Nov5;

import java.util.Scanner;

public class Demo2 
{
	//verify given marks pass or fail

	Scanner s= new Scanner(System.in);
{
	for(int i=1;i<=5;i++)
{
	System.out.println("Enter Marks");
	int marks =s.nextInt();
	if (marks>=35) 
{
		System.out.println("Pass   "+marks);
	}
	else
{
		System.out.println("Fail   "+marks);
	}
	}
	
	}
	}
	


