import java.util.Scanner;
class threedimenisonalarrayelement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size  array");
		int s=sc.nextInt();
		int [][][] a =new int[s][s][s];
		System.out.println("enter a array element ");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{
				a[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("enter final element");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				for(int k=0;k<=a[i][j].length-1;k++)
				{

		System.out.println(""+a[i][j][k]+"");
				}
			}
		}
		System.out.println();
		}
	}
