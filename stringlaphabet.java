import java.util.Scanner;
class stringlaphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		char [] ch=new char[s.length()];
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=s.charAt(i);
		}
		System.out.println("enter laphabte element are");
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]>='A'&&ch[i]<='z')
			{
			System.out.println(ch[i]);
			}
		}
	}
}
