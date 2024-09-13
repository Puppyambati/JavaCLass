import java.util.Scanner;
class swapinglexicographicalorder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String [] a=s.split(" ");
		for(int cycle=1;cycle<=a.length-1;cycle++)
		{
			for(int i=0;i<=a.length-2;i++)
			{
				int x = a[i].compareTo(a[i+1]);
				if(x>0)
				{
					String temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i!=a.length-1)
			{
				System.out.println(a[i]+"");
			}
			else
			{
				System.out.println(a[i]);
			}
		}
		System.out.println();
	}
	
}
