import java.util.Scanner;
class buildahouse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of seens");
		int n=sc.nextInt();
		char [] a=new char[n];
		int [] w1=new int[n];
		int [] w2=new int[n];
		System.out.println("enter detalis of time");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.next().charAt(0);
			w1[i]=sc.nextInt();
			w2[i]=sc.nextInt();
		}
		double lessdays=(w1[0]*w2[0]/w1[0]+w2[0]);
		int index=0;
		for(int i=0;i<=a.length-1;i++)
		{
			double x=(w1[i]*w2[i]/w1[i]+w2[i]);
			if(x<lessdays)
			{
				lessdays=x;
				index=i;
			}
		}
		System.out.println("pruthvi has to select team:"+a[index]+"whic team"+lessdays);
	}
	
}
