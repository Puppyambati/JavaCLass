import java.util.Scanner;
class palindromstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("string palindrom");
		}
		else
		{
			System.out.println("not string palindrom");
		}
	}
}
