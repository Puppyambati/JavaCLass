import java.util.Scanner;
class digitstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
