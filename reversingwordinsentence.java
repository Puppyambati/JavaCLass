import java.util.Scanner;
class reversingwordinsentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s2="";
		String temp=s+" ";
		int count=0;
		for(int i=0;i<=temp.length()-1;i++)
		{
			if(temp.charAt(i)!=' ')
			{
				count++;
			}
		}
		String [] a=new String[count];
		String s3="";
		int index=0;
		for(int i=0;i<=temp.length()-1;i++)
		{
			if(temp.charAt(i)!=' ')
			{
				s3=s3+temp.charAt(i);
			}
			else
			{
				a[index++]=s3;
				s3="";
			}
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			String rev="";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				rev=rev+a[i].charAt(j);
			}
			if(i==a.length-1)
				{
					s2=s2+rev;
				}
				else
				{
					s2=s2+rev+" ";
				}
			}
			
			System.out.println(s2);
	}
}
