import java.util.Scanner;
class pearlshop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter count of friends");
		int n=sc.nextInt();
		int [] a=new int[n];
		System.out.println("enter count of pearls that each bought one by one");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		int smallest=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+(a[i]/smallest);
		}
		System.out.println("no of possible largest necklaces are:"+sum);
	}
	
}
