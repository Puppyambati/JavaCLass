import java.util.Scanner;
class Twodimenisonalarray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size 1 of 2-D array");
		System.out.println("enter size 2 of 2-D array");
		int [][] a=new int [sc.nextInt()][sc.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elemenets are:");
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.println(" "+a[i][j]+" ");
			}
		}
		System.out.println();
	}
	
}
