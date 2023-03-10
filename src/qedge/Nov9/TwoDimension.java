package qedge.Nov9;

public class TwoDimension {

	public static void main(String[] args) {
		String x[][]=new String[4][2];
		x[0][0]="admin1";
		x[0][1]="test1";
		x[1][0]="admin2";
		x[1][1]="test2";
		x[2][0]="admin3";
		x[2][1]="test3";
		x[3][0]="admin4";
		x[3][1]="test4";
		System.out.println(x.length);				//4

		System.out.println(x[0].length);			//2
		for(int i=0;i<x.length;i++)
		{
				for(int j=0;j<x[i].length;j++)
			{
			System.out.println(x[i][j]+"\t");
			}
System.out.println();
		}
	}
}
