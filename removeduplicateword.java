import java.util.Scanner;
class removeduplicateword 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two remove duplicate words");
		String s=sc.nextLine();
		
		String [] a = s.split(" ");
		
		for(int i=0;i<=a.length-1;i++)
		{
			boolean ispresent=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i].equals(a[k]))
				{
					ispresent=true;
				}
			}
			if(ispresent==false)
			{
				System.out.println(a[i]+" ");
			}
		}

	}
}
