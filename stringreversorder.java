import java.util.Scanner;
class stringreversorder 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char [] ch=new char[s.length()];
		for(int i=0;i<=s.length()-1;i++)
		{
			ch[i]=s.charAt(i);
		}
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
}
