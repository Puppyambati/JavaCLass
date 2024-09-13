import java.util.Scanner;
class printabsentalphabets 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(char i='A';i<='Z';i++)
		{
			boolean ispresent=false;
			for(int j=0;j<=s.length()-1;i++)
			{
				if(i==s.charAt(j))
				{
					ispresent=true;
					break;
				}
			}
			if(ispresent==false)
			{
				System.out.println(i);
			}
		}

	}
}
