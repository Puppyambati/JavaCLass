import java.util.Scanner;
class reverssentancestring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1="";
		String [] a= s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
		String rev="";
		for(int j=a[i].length()-1;j>=0;j--)
			{
			rev=rev+a[i].charAt(j);
			}
		if(i==a.length-1)
		{
			s1=s1+rev;
		}
		else
		{
			s1=s1+rev+"";
		}
		}
		System.out.println(s1);
		

	}
}
