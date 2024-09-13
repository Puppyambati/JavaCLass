import java.util.Scanner;
class vowelspresentstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
		System.out.println(s.charAt(i));
			}
		}
	}
}
