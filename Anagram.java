import java.util.Scanner;
class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two words");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean isallpresent=true;
		for(int i=0;i<=s1.length()-1;i++)
		{
			boolean ischarpresent=false;
			for(int j=0;j<=s1.length()-2;j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					ischarpresent=true;
				}
			}
			if(ischarpresent==false)
			{
				isallpresent=true;
				break;
			}
		}
		if(isallpresent==true&&s1.length()==s2.length())
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
