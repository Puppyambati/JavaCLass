import java.util.Scanner;
class string 
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
		System.out.println("char array element are:");
		for(int i=0;i<=ch.length-1;i++)
		{
		System.out.println(ch[i]);
		}
	}
}
