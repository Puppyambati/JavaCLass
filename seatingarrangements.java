import java.util.Scanner;
class  seatingarrangements
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no of friends");
		int n=sc.nextInt();
		char [] a=new char[n];
		System.out.println("enter names of all friends one by one in order of discussion");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		char [] b=new char[n];
		System.out.println("enter the detalis");
		for(int i=0;i<=a.length-1;i++)
		{
			char ch=sc.next().charAt(0);
			if(ch=='l')
			{
				int j=sc.nextInt();
				b[j]=a[i];
			}
			else if(ch=='r')
			{
				int j=sc.nextInt();
				b[(a.length-1)-j]=a[i];
			}
		}
		System.out.println("seating arrangement");
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]+" ");
		}

			
	}
}
