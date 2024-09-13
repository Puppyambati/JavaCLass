import java.util.Scanner;
class stringstorethearray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String [] a=s.split(" ");
		s=s+ch;
		int size=0;
		System.out.println("words present in the sentance are:");
		for(int i=0;i<=s.length-1;i++)
		{
		if(s.charAt(i)==ch)
			{
			size++;
			}
		}
		String [] a=new String[size];
		String s2="";
		int index=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=ch)
			{
				s2=s2+s.charAt(i);
			}
			else if(s.charAt(i)==ch)
			{
				a[index++]=s2;
				s2="";
			}
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}
}
