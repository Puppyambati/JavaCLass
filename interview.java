import java.util.Scanner;
class interview 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-2;i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				if(Character.isDigit(s.charAt(i+1)))
				{
					for(char j='1';j<=s.charAt(i+1);j++)
					{
						System.out.println(s.charAt(i));
					}
				}
			}
		}
	}
}
