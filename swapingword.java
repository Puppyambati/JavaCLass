import java.util.Scanner;
class swapingword  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of player");
		String n=sc.nextLine();
		String [] s=new String[n];
		System.out.println("enter player name");
		for(int i=0;i<=s.length-2;i++)
		{
			s[i]=sc.next();
		}
		for(int cycle=1;cycle<=s.length-1;cycle++)
		{
			for(int i=0;i<=s.length-2;i++)
			{
				int x = s[i].compareTo(s[i+1]);
				if(x>0)
				{
					String temp=s[i];
					s[i]=s[i+1];
					s[i+1]=temp;
				}
			}
		}
		System.out.println("player name are:");
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.println(s[i]+" ");
		}
	}
}
