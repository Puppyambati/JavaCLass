import java.util.Scanner;
class revers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String [] a=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			if(i!=0)
			{
				System.out.println(a[i]+" ");
			}
			else
			{
				System.out.println(a[i]);
			}
		}
	}
}