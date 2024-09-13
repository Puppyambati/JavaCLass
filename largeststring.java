import java.util.Scanner;
class largeststring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String [] a=s.split(" ");
		int indexlargest=0;
		int largestcount=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i].length()>largestcount)
			{
				largestcount=a[i].length();
				indexlargest=i;
			}
		}
		System.out.println("largest word int the sentence is:"+a[indexlargest]);
	}
}
