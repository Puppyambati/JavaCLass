import java.util.Scanner;
class Twodimesionalarray2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size 1 of 2-D array");
		int [] [] a=new int[sc.nextInt()][];
		System.out.println("enter chidhood array size");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=new int[sc.nextInt()];
		}
		System.out.println("enter array element");
		for(int i=0;i<=a.length-1;i++)
			{
			for(int j=0;j<=a[i].length-1;j++)
				{
				a[i][j]=sc.nextInt();
				}
				}
	System.out.println("array element are");
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
			System.out.println(" "+a[i][j]+" ");
		}
		System.out.println();
	}
	}
}
