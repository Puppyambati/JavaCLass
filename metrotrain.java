import java.util.Scanner;
class metrotrain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of station");
		int n=sc.nextInt();
		int [] a=new int[n];
		char [] b= new char[n];
		System.out.println("enter nname of station along with no of pessangers");
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=sc.next().charAt(0);
			a[i]=sc.nextInt();
		}
		for(int cycle=1;cycle<=a.length-1;cycle++)
		{
			
			for(int i=0;i<=a.length-2;i++)
			{
				if(a[i]<a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					char temp2=b[i];
					b[i]=b[i+1];
					b[i+1]=temp2;
				}
			}
		}
		System.out.println("station pessangers");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(b[i]+"-"+a[i]);
		}

	}
}
